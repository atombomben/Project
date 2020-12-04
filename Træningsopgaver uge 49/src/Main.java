import java.awt.*;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static MenuValg menuValg;


    public static void main(String[] args) {


        menuValg = new MenuAdding();
        showMenu();

    }

    private static void showMenu() {

        menuValg.displayOptions();

        boolean finish = false;

        while (!finish) {


            switch (scan.nextLine()) {
                case "1":
                    menuValg.Beregn();
                    break;
                case "2":
                    menuValg.Udskriv();
                    break;
                case "3":
                    menuValg.Hjælp();
                    break;
                case "4":
                    finish = true;
                    break;
            }
        }
    }
}
