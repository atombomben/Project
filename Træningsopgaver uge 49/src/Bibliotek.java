import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class Bibliotek {


    private static ArrayList<Bog> bogliste = new ArrayList<>();


    public Bibliotek() {

        Bog bog1 = new Bog(9788711694343L, "Et forjættet land", 2020);
        Bog bog2 = new Bog(9782253041474L, "Hernani", 1987);
        Bog bog3 = new Bog(9781492296188L, "Hugo Killer Shark", 2013);
        Bog bog4 = new Bog(9788711694343L, "Et forjættet land", 2020);
        this.bogliste.add(bog1);
        this.bogliste.add(bog2);
        this.bogliste.add(bog3);
        this.bogliste.add(bog4);

    }

    public static boolean sameISBN (Bog bogen) {
        for(Bog bog: bogliste) {
            if(bog.equals(bogen))
            return true;
        }
        return false;
    }
}




