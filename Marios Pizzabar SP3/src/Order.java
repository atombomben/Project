import java.util.ArrayList;
//@Author Peter Thomsen + Daniel Pedersen
public class Order implements Comparable<Order> {

    public int setTime;
    int orderId;
    ArrayList<Pizza> pizzas = new ArrayList<>();
    int totalPrice;
    int time;

    Integer comparableTime; // using Integer data type to enable the "compareTo" method used by Comparable interface.

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);

    }

    public void calculateTotalPrice() {
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.price;
        }
    }

    public void setTime(int time) {
        this.time = time;
        comparableTime = time;
    }

    @Override
    public String toString() {
        String pizzaString = new String();
        for (Pizza pizza : pizzas) {
            pizzaString += " " + pizza.name + ",";
        }
        return "orderId: " + orderId + ", Pizzas: " + pizzaString + " totalPrice: " + totalPrice + ", Pickup time: " + time;
    }

    @Override
    public int compareTo(Order o) {
        return this.comparableTime.compareTo(o.comparableTime);
    }
}