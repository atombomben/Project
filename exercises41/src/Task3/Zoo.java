package Task3;

import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> animals = new ArrayList<Animal>();

    public void makeAllSounds() {
        for (Animal element:animals) {
            element.makeSound();
        }
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printNumberOfLegs() {
        int totalNumberOfLegs = 0;
        for (Animal gerr:animals) {
            totalNumberOfLegs += gerr.getNumberOfLegs();
        }
        System.out.println("Total number of legs in my zoo: "+totalNumberOfLegs);
    }
}
