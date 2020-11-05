import java.util.ArrayList;
//Peter Thomsen
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
        }
    }
    public Order getOrder (int orderId) {
        for (Order order: currentOrders) {
            if (order.orderId == orderId) {
                return order;
            }
        }
        return null;
    }

    public void showAll() {
        for (Order order: currentOrders) {
            System.out.println(order.toString());
        }
    }
}
