import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class ArrayListTest {
    Task1 task1 = new Task1();
    ArrayList<String> arrayList = new ArrayList<String>() {
        {add("Zlange");add("C vitamin");add("Kode");}};

    String Gerr = "Test";
    String Herr = null;

    @Test
    public void testNull () {
        assertEquals(false,Task1.ArrayList(Herr,arrayList));
    }

    @Test
    public void testString () {
        assertNotEquals(false,Task1.ArrayList(Gerr,arrayList));

    }

}
