import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class Bibliotek {


    private static ArrayList<Bog> bog = new ArrayList<>();


    public Bibliotek() {

        Bog bog1 = new Bog(9788711694343L, "Et forjættet land", 2020);
        Bog bog2 = new Bog(9782253041474L, "Hernani", 1987);
        Bog bog3 = new Bog(9781492296188L, "Hugo Killer Shark", 2013);
        Bog bog4 = new Bog(9788711694343L, "Et forjættet land", 2020);
        this.bog.add(bog1);
        this.bog.add(bog2);
        this.bog.add(bog3);
        this.bog.add(bog4);

    }

    public static boolean sameISBN (Bog bog) {
    if (Bibliotek.bog.contains(bog)) {
        return true;
        }
        return false;
    }

}
