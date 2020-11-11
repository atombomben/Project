import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//@Author Peter Thomsen

public class ReadFile {

    public void readOldOrderList(Menu menu) {

        try {
            File oldOrders = new File("oldOrders.txt");
            Scanner myReader = new Scanner(oldOrders);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println(data);
                String[] reader = data.split(":");
                /*for (int i = 0; i < reader.length; i++) {
                    System.out.println(reader[i]);
                }*/
                String[] orderIDString = reader[1].split(",");
                int orderID = Integer.parseInt(orderIDString[0].trim());
                String[] pizzaString = reader[2].split(",");
                ArrayList<String> pizzaNames = new ArrayList<>();
                for (int i = 0; i < pizzaString.length -1; i++) {
                    pizzaNames.add(pizzaString[i].trim());
                }
                int pickUpTime = Integer.parseInt(reader[4].trim());
                Order order = new Order(orderID);
                for (String pizza: pizzaNames) {
                    order.addPizza(menu.getPizza(pizza));
                }
                order.calculateTotalPrice();
                order.setTime(pickUpTime);
                menu.addOldOrder(order);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("No old Orders");
        }

    }
}