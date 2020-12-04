import org.junit.jupiter.api.Test;
import java.util.ArrayList;


public class Scanner {

    public ArrayList<String> options = new ArrayList();
    static java.util.Scanner scan = new java.util.Scanner(System.in);
    static MenuValg menuValg;


    public void displayOptions() {
        try {
            this.options.add("1) Beregn");
            this.options.add("2) Udskriv");
            this.options.add("3) Hjælp");
            this.options.add("4) Exit");
            System.out.println(options.get(0));
            System.out.println(options.get(1));
            System.out.println(options.get(2));
            System.out.println(options.get(3));
        } catch (Exception e) {
            System.out.println("Something wrong");
        }
    }

    public void Beregn() {
        try {
            System.out.println("Hvad er 5+5");
            if (promptForAnswer() == 10) {
                System.out.println("Sandt");
            }
            else {
                System.out.println("Forkert");
            }

        } catch (Exception e) {
            System.out.println("Somethings wrong");
        }
        displayOptions();
    }

    public void Udskriv() {
        try {
            System.out.println("loL");


        } catch (Exception e) {
            System.out.println("Somethings wrong");
        }
        displayOptions();
    }

    public void Hjælp() {
        try {
            System.out.println("loL");


        } catch (Exception e) {
            System.out.println("Somethings wrong");
        }
        displayOptions();
    }

    private int promptForAnswer() {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        return scan.nextInt();
    }



    @Test
    public void mainTest () {
    menuValg = new MenuAdding();
    }

    public void showMenu() {

        menuValg.displayOptions();

        boolean finish = false;

        while (!finish) {

            switch (scan.nextLine()) {
                case "1":
                    Beregn();
                    break;
                case "2":
                    Udskriv();
                    break;
                case "3":
                    Hjælp();
                    break;
                case "4":
                    finish = true;
                    break;
            }
        }
    }
}
