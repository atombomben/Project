import java.util.ArrayList;
//Peter Thomsen
public class Order {

    int orderId;
    ArrayList<Pizza> pizzas = new ArrayList<>();
    int totalPrice;
    int time;

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

    public void addTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        String pizzaString = new String();
        for (Pizza pizza : pizzas) {
            pizzaString += " " + pizza.name + ",";
        }
        return "orderId: " + orderId + ", Pizzas: " + pizzaString + " totalPrice: " + totalPrice + ", Pickup time: " + time;
    }
}