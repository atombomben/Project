import java.util.ArrayList;
import java.util.Scanner;

abstract public class MenuValg {

    public ArrayList<String> options = new ArrayList();


    public void displayOptions() {
        try {
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
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }


}
