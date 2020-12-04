import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class BogTest {

    Bibliotek bio = new Bibliotek();
    ArrayList<Bog> bog = new ArrayList<>();
    Bog bog1 = new Bog(9788711694343L, "Et forjættet land", 2020);
    Bog bog2 = new Bog(9782253041474L, "Hernani", 1987);
    Bog bog3 = new Bog(9781492296188L, "Hugo Killer Shark", 2013);
    Bog bog4 = new Bog(9788711694343L, "Et forjættet land", 2020);

    @Test
    public void sameBook () {

    assertEquals(true, bog1.equals(bog4));
    }

    @Test
    public void differentBook () {
        assertNotEquals(true, bog2.equals(bog3));

    }
}
