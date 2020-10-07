package Task3;

public class Main {


    public static void main(String[] args) {

        Zoo herrzoo = new Zoo();
        Snake Python = new Snake(0);
        Ostrich Corki = new Ostrich(2);
        Crocodile Russiandilo = new Crocodile(4);
        herrzoo.addAnimal(Python);
        herrzoo.addAnimal(Corki);
        herrzoo.addAnimal(Russiandilo);
        herrzoo.makeAllSounds();
        herrzoo.printNumberOfLegs();
        
    }
}
