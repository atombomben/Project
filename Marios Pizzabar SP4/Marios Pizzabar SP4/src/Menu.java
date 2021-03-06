import com.sun.deploy.util.OrderedHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//@Author Peter Thomsen
abstract public class Menu {

    //OrderList orderList = new OrderList();
    Order order;
    //WriteFile writeFile = new WriteFile();
    DBConnector dbConnector = new DBConnector();

    public ArrayList<String> options = new ArrayList();
    public ArrayList<Pizza> pizzas = new ArrayList();

    public void displayOptions() {
        System.out.println(options.get(0));
        System.out.println(options.get(1));
        System.out.println(options.get(2));
        System.out.println(options.get(3));
        System.out.println(options.get(4));
        System.out.println(options.get(5));
    }

    public void showOrders() {
        ArrayList<Order> currentOrders = dbConnector.showAllOrders();
        for (Order order: currentOrders) {
        System.out.println(order.toString());

        }
        displayOptions();
    }

    public void createOrder() {
        try {
            order = new Order();
            addPizzasToOrder(order);
            order.calculateTotalPrice();
            System.out.println("Angiv afhentningstidspunkt: eks. '2000' ");
            order.setPickUpTime(checkForTime());
            int id = dbConnector.CreateOrder(order);
            order.orderId = id;
            //writeFile.addToOldOrderList(order.toString());

        } catch (Exception e) {
            System.out.println("Не удалось создать заказ, попробуйте еще раз");
                                    //"Order kunne ikke oprettes, prøv igen"
        }
        displayOptions();
    }

    //metoden er lavet af Peter+Daniel
    private void addPizzasToOrder(Order order) {
        int pizzaNumber = -1;
        while (pizzaNumber != 0) {
            try {
            System.out.println("Angiv pizzanummer eller tryk 0 for at gå videre: ");
            pizzaNumber = promptForAnswer();
            for (Pizza pizza : pizzas) {
                if (pizza.number == pizzaNumber) {
                    order.addPizza(pizza);
                }
            }
            //Making sure that the user knows if they put in a number higher than the amount of pizzas
            if (pizzaNumber > pizzas.size()) {
                System.out.println("Der findes ikke en pizza med det indtastede nummer, prøv igen ");
                    }
                }
            catch (Exception e) {
                System.out.println("Der findes ikke en pizza med det indtastede nummer, prøv igen ");
            }
        }
    }

    //@Author Peter Thomsen
    public void deleteOrder() {
        ArrayList<Order> currentOrders = dbConnector.showAllOrders();
        for (Order order: currentOrders) {
            System.out.println(order.toString());

        }
        System.out.println("Write ID for order you would like to delete?");
        dbConnector.DeleteOrder(promptForAnswer());
        displayOptions();
    }

    public void showOldOrders() {
        ArrayList<Order> oldOrders = dbConnector.showOldOrders();
        for (Order order: oldOrders) {
            System.out.println(order.toString());

        }
        displayOptions();
    }

    private int promptForAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private int checkForTime() {
        boolean finish = false;
        int time = 0;
        while (finish != true) {
            try {
                time = promptForAnswer();
                if (time <= 2400) {
                    finish = true;
                } else {
                    System.out.println("Ugyldigt tidspunkt, prøv igen ");
                }
            }
        catch (Exception e) {
                    System.out.println("Ugyldigt tidspunkt, prøv igen ");
                }
            }
            return time;
        }

    public Pizza getPizza(String pizzaName) {
        for (Pizza pizza: pizzas) {
            if (pizza.name.equals(pizzaName)) {
                return pizza;
            }
        }
        return null;
    }

    public void addOldOrder(Order order) {
        //orderList.addOldOrder(order);

    }

}