import java.util.ArrayList;
import java.util.Collections;

//@Author Peter Thomsen + Daniel Pedersen
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
            oldOrders.add(getOrder(orderId));
            currentOrders.remove(getOrder(orderId));
            System.out.println("Order " + orderId + " successfully deleted!");

        }
        catch (Exception e) {
            System.out.println("Идентификатор заказов не существует");
                                //"Ordre-ID findes ikke"
        }
    }

    public void showAllOrders() {
        Collections.sort(currentOrders);
        for (Order order: currentOrders) {
            System.out.println(order.toString());
        }
    }

    public void showAllOldOrders() {
        for (Order order: oldOrders) {
            System.out.println(order.toString());
        }
    }

    public void addOldOrder(Order order) {
        oldOrders.add(order);

    }

    public Order getOrder(int orderId) {
        for (Order order: currentOrders ) {
            if (order.orderId == (orderId)) {
                return order;
            }
        }
        return null;
    }

}
