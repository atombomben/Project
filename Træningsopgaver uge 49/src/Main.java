import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {


    }


    public boolean ArrayList (String s, ArrayList<String> stringList) {
        try {

        if (!stringList.contains(s)) {
            stringList.add(s);
            Collections.sort(stringList);
            return true;
        }
        return false;
        } catch (Exception e) {
            return false;
        }
    }
}
