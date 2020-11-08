import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

//@Author Peter Thomsen - minitest
public class MainTest {

    Pizza pizza111 = new Pizza("Test Pizza", 111, 1000);
    Pizza pizza222 = new Pizza("Test Pizza2", 222, 2000);
    Order order = new Order(1);


    @Test
    public void testCalculatePizzaPrice() {
        order.addPizza(pizza111);
        order.addPizza(pizza222);
        order.calculateTotalPrice();

        assertEquals(order.totalPrice , 3000);

    }
}