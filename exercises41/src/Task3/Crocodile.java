package Task3;

public class Crocodile extends Animal {
    public Crocodile(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("zdohni blyat");
    }
}
