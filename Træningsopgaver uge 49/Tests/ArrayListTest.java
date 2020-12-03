import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class ArrayListTest {
    Main main = new Main();
    ArrayList<String> arrayList = new ArrayList<String>() {
        {add("Zlange");add("C vitamin");add("Kode");}};

    String Gerr = "Test";
    String Herr = null;

    @Test
    public void testNull () {
        assertEquals(false,main.ArrayList(Herr,arrayList));
    }

    @Test
    public void testString () {
        assertNotEquals(false,main.ArrayList(Gerr,arrayList));

    }
}
