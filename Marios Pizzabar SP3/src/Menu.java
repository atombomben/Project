import java.util.ArrayList;
import java.util.Scanner;
//@Author Peter Thomsen
abstract public class Menu {
    OrderList orderList = new OrderList();
    Order order;
    WriteFile writeFile = new WriteFile();

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
        orderList.showAllOrders();
        displayOptions();
    }

    public void createOrder() {
        try {
            if (orderList.currentOrders.isEmpty()) {
                order = new Order(1);
            } else {
                Order lastOrder = orderList.currentOrders.get(orderList.currentOrders.size() - 1);
                order = new Order(lastOrder.orderId + 1);
            }
            addPizzasToOrder(order);
            order.calculateTotalPrice();
            System.out.println("Angiv afhentningstidspunkt: eks. '2000' ");
            order.time = promptForAnswer();
            orderList.addOrder(order);
            writeFile.addToOldOrderList(order.toString());
        }  catch (Exception e) {
            System.out.println("Не удалось создать заказ, попробуйте еще раз");
                                //"Order kunne ikke oprettes, prøv igen"
        }
            displayOptions();
        }

    //metoden er lavet af Peter+Daniel
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
            //Making sure that the user knows if they put in a number higher than the amount of pizzas
            if (pizzaNumber > pizzas.size()) {
                System.out.println("Der findes ikke en pizza med det indtastede nummer, prøv igen ");
            }
        }
    }
    //@Author Peter Thomsen
    public void deleteOrder() {
        orderList.showAllOrders();
        System.out.println("Write ID for order you would like to delete?");
        orderList.removeOrder(promptForAnswer());
        displayOptions();
    }

    public void showOldOrders() {
        orderList.showAllOldOrders();
        displayOptions();
    }

    private int promptForAnswer() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
