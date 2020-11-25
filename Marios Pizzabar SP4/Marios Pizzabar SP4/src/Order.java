import java.util.ArrayList;
//@Author Peter Thomsen + Daniel Pedersen
public class Order implements Comparable<Order> {

    int orderId;
    ArrayList<Pizza> pizzas = new ArrayList<>();
    int totalPrice;
    int pickUpTime;

    Integer comparableTime; // using Integer data type to enable the "compareTo" method used by Comparable interface.

    public Order () {

    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);

    }

    public void calculateTotalPrice() {
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.price;
        }
    }

    public void setPickUpTime(int pickUpTime) {
        this.pickUpTime = pickUpTime;
        comparableTime = pickUpTime;
    }

    @Override
    public String toString() {
        String pizzaString = new String();
        for (Pizza pizza : pizzas) {
            pizzaString += " " + pizza.name + ",";
        }
        return "orderId: " + orderId + ", Pizzas: " + pizzaString + " totalPrice: " + totalPrice + ", Pickup time: " + pickUpTime;
    }

    @Override
    public int compareTo(Order o) {
        return this.comparableTime.compareTo(o.comparableTime);
    }
}