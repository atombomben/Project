//@Author Peter Thomsen

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;


public class DBConnector {


    public ArrayList<Order> showAllOrders() {

        try {
            ArrayList<Order> orders = new ArrayList<>();
            Connection con = getConnection();
            String query = "select * from orders";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("OrderId");
                int totalPrice = rs.getInt("TotalPrice");
                int pickUpTime = rs.getInt("PickUpTime");


                ArrayList<Pizza> orderPizzas = getPizzas(id);
                Order order = new Order();
                order.orderId = id;
                order.totalPrice = totalPrice;
                order.pickUpTime = pickUpTime;
                order.pizzas = orderPizzas;
                orders.add(order);
            }
            con.close();
            return orders;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<Pizza> getPizzas(int id) {

        try {

            Connection con = getConnection();

            String query = "SELECT pz.*\n" +
                    "    FROM OrdersPizza AS op\n" +
                    "    JOIN Pizza AS pz ON op.PizzaId = pz.PizzaId\n" +
                    "    WHERE op.OrderId = " + id + ";";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Pizza> pizzas = new ArrayList<>();
            while (rs.next()) {

                int number = rs.getInt("PizzaId");
                String name = rs.getString("PizzaName");
                int price = rs.getInt("Price");
                Pizza pizza = new Pizza(name, number, price);
                pizzas.add(pizza);

            }
            con.close();
            return pizzas;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    public int CreateOrder(Order order) {

        try {

            Connection con = getConnection();


            String query = "insert into Orders(TotalPrice, PickUpTime)" + "values(?,?)";
            PreparedStatement stmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, order.totalPrice);
            stmt.setInt(2, order.pickUpTime);
            stmt.executeUpdate();
            ResultSet rs=stmt.getGeneratedKeys();
            int orderId = 0;
            if(rs.next()){
               orderId = rs.getInt(1);
            }
            for (Pizza pizza:order.pizzas
                 ) {
                String query2 = "INSERT INTO OrdersPizza (OrderId, PizzaId)" + "values(?,?)";
                PreparedStatement stmt2 = con.prepareStatement(query2);
                stmt2.setInt(1, orderId);
                stmt2.setInt(2, pizza.number);
                stmt2.executeUpdate();
            }
                con.close();
                return orderId;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public void DeleteOrder(int id) {

        try {

            Connection con = getConnection();

            String query = "select * from orders where OrderId = " + id + ";";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {


                int totalPrice = rs.getInt("TotalPrice");
                int pickUpTime = rs.getInt("PickUpTime");


                ArrayList<Pizza> orderPizzas = getPizzas(id);
                Order order = new Order();
                order.orderId = id;
                order.totalPrice = totalPrice;
                order.pickUpTime = pickUpTime;
                order.pizzas = orderPizzas;
                CreateOldOrder(order);
            }
            query = "DELETE FROM OrdersPizza where OrderId = ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.execute();
            query = "DELETE FROM Orders where OrderId = ?";
            preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.execute();
            con.close();
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public void CreateOldOrder(Order order) {

        try {

            Connection con = getConnection();


            String query = "insert into OldOrders(OldOrderId, TotalPrice, PickUpTime)" + "values(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, order.orderId);
            stmt.setInt(2, order.totalPrice);
            stmt.setInt(3, order.pickUpTime);
            stmt.executeUpdate();

            for (Pizza pizza:order.pizzas
            ) {
                String query2 = "INSERT INTO OldOrdersPizza (OldOrderId, PizzaId)" + "values(?,?)";
                PreparedStatement stmt2 = con.prepareStatement(query2);
                stmt2.setInt(1, order.orderId);
                stmt2.setInt(2, pizza.number);
                stmt2.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public ArrayList<Order> showOldOrders() {

        try {
            ArrayList<Order> oldOrders = new ArrayList<>();

            Connection con = getConnection();

            String query = "select * from OldOrders";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("OldOrderId");
                int totalPrice = rs.getInt("TotalPrice");
                int pickUpTime = rs.getInt("PickUpTime");


                ArrayList<Pizza> oldOrderPizzas = getOldPizzas(id);
                Order order = new Order();
                order.orderId = id;
                order.totalPrice = totalPrice;
                order.pickUpTime = pickUpTime;
                order.pizzas = oldOrderPizzas;
                oldOrders.add(order);
            }
            con.close();
            return oldOrders;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<Pizza> getOldPizzas(int id) {

        try {
            ArrayList<Pizza> pizzas = new ArrayList<>();
            Connection con = getConnection();

            String query = "SELECT pz.*\n" +
                    "    FROM OldOrdersPizza AS oop\n" +
                    "    JOIN Pizza AS pz ON oop.PizzaId = pz.PizzaId\n" +
                    "    WHERE oop.OldOrderId = " + id + ";";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int number = rs.getInt("PizzaId");
                String name = rs.getString("PizzaName");
                int price = rs.getInt("Price");
                Pizza pizza = new Pizza(name, number, price);
                pizzas.add(pizza);

            }
            con.close();
            return pizzas;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/SP4?serverTimezone=Europe/Rome", "root", "ENTER PASSWORD");
    }
}
