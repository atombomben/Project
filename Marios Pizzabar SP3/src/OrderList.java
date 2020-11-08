import java.util.ArrayList;
//@Author Peter Thomsen
public class OrderList {

    ArrayList<Order> currentOrders = new ArrayList<>();
    ArrayList<Order> oldOrders = new ArrayList<>();

    public OrderList() {
    }

    public void addOrder(Order order) {
        currentOrders.add(order);

    }

    public void removeOrder(int orderId) {

        try {
            oldOrders.add(currentOrders.get(orderId - 1));
            currentOrders.remove(orderId - 1);
            System.out.println("Order " + orderId + " successfully deleted!");

        }
        catch (Exception e) {
            System.out.println("Идентификатор заказов не существует");
                                //"Ordre-ID findes ikke"
        }
    }

    public void showAllOrders() {
        for (Order order: currentOrders) {
            System.out.println(order.toString());
        }
    }

    public void showAllOldOrders() {
        for (Order order: oldOrders) {
            System.out.println(order.toString());
        }
    }

}
