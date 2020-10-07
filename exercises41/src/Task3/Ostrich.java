package Task3;

public class Ostrich extends Animal{
    public Ostrich(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("helibobter");
    }
}
