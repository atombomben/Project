import java.util.ArrayList;
import java.util.Scanner;
//Peter Thomsen
abstract public class Menu {
    OrderList orderList = new OrderList();
    Order order;

    public ArrayList<String> options = new ArrayList();
    public ArrayList<Pizza> pizzas = new ArrayList();

    public void displayOptions() {
        System.out.println(options.get(0));
        System.out.println(options.get(1));
        System.out.println(options.get(2));
        System.out.println(options.get(3));
        System.out.println(options.get(4));
    }

    public void showOrders() {
        orderList.showAll();
        displayOptions();
    }

    public void createOrder() {
        //System.out.println("Angiv ordrer ID: ");
        //int orderId = promptForAnswer();
        if (orderList.currentOrders.isEmpty()) {
            order = new Order(1);
        }
        else {
            Order lastOrder = orderList.currentOrders.get(orderList.currentOrders.size() - 1);
            order = new Order(lastOrder.orderId + 1);
        }
        addPizzasToOrder(order);
        order.calculateTotalPrice();
        System.out.println("Angiv afhentningstidspunkt: ");
        order.time = promptForAnswer();
        orderList.addOrder(order);
        displayOptions();
    }

    private void addPizzasToOrder(Order order) {
        int pizzaNumber = -1;
        while (pizzaNumber != 0) {
            System.out.println("Angiv pizzanummer eller tryk 0 for at gå videre: ");
            pizzaNumber = promptForAnswer();
            for (Pizza pizza : pizzas) {
                if (pizza.number == pizzaNumber) {
                    order.addPizza(pizza);
                }
            }
        }
    }

    public void deleteOrder() {

        System.out.println("Which order would you like to delete?");
        orderList.removeOrder(promptForAnswer());


        displayOptions();
    }

    public void showOldOrders() {

        displayOptions();
    }


    private int promptForAnswer() {
        Scanner scan = new Scanner(System.in);
        int userinput = scan.nextInt();
        return userinput;
    }
}
