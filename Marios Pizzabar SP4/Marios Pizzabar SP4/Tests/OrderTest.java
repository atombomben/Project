import java.util.ArrayList;
import org.junit.Test;
import static junit.framework.TestCase.*;

//@Author Rasmus

public class OrderTest {
    ArrayList<Pizza> pizzas = new ArrayList<>();
    Pizza pizza1 = new Pizza("testPizza1",1,50);
    Pizza pizza2 = new Pizza("testPizza2",2,40);


    int totalPrice;
    int pickUpTime;
    int orderId;


    @Test
    public void testAddPizza() {
        pizzas.add(pizza1);
        assertNotNull(pizzas);
    }

    @Test
    public void testCalculateTotalPrice() {
        pizzas.add(pizza1);
        pizzas.add(pizza2);
        for(Pizza pizza : pizzas){
            totalPrice += pizza.price;
        }
        assertEquals(pizza1.price+pizza2.price,totalPrice);

    }


    @Test
    public void testToString() {
        int orderId =1;
        totalPrice = pizza1.price+pizza2.price;
        int pickUpTime = 2100;

        pizzas.add(pizza1);
        pizzas.add(pizza2);
        String pizzaString = new String();
        for(Pizza pizza : pizzas){
            pizzaString += " " + pizza.name + ",";
        }
        assertEquals("orderId: 1, Pizzas:  testPizza1, testPizza2, totalPrice: 90, Pickup time: 2100",
                "orderId: " + orderId + ", Pizzas: " + pizzaString + " totalPrice: "
                        + totalPrice + ", Pickup time: " + pickUpTime);

    }

    @Test
    public void testCompareTo() {
    }
}