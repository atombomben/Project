import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import static junit.framework.TestCase.*;

//@Author Rasmus

public class OrderListTest {
    ArrayList<Order> testEmptyArrayList = new ArrayList<>();
    ArrayList<Order> currentOrders = new ArrayList<>();
    ArrayList<Order> oldOrders = new ArrayList<>();
    ArrayList<String> toSortTestArray = new ArrayList<>();
    ArrayList<String> sortedTestArray = new ArrayList<>();

    @Test
    public void addOrder() {
        Order testOrder = new Order();
        currentOrders.add(testOrder);
        assertNotNull(currentOrders);
    }

    @Test
    public void removeOrder() {
    int testOrderId = 0;
    Order testOrder = new Order();
    currentOrders.add(testOrder);
    oldOrders.add(testOrder);
    currentOrders.remove(testOrderId);
    assertEquals(testEmptyArrayList,currentOrders);
    assertNotNull(oldOrders);


    }

    @Test
    public void showAllOrders() {
        toSortTestArray.add("2. pizza 2.");
        toSortTestArray.add("1. pizza 1.");
        toSortTestArray.add("0. pizza 0.");

        sortedTestArray.add("0. pizza 0.");
        sortedTestArray.add("1. pizza 1.");
        sortedTestArray.add("2. pizza 2.");

        Collections.sort(toSortTestArray);
        assertEquals(sortedTestArray,toSortTestArray);


    }

    @Test
    public void getOrder() {
        int orderId = 0;
        Order order = new Order();
        currentOrders.add(order);
        if(order.orderId==orderId){
            orderId =+1;
        }
        assertEquals(1,orderId);


    }
}