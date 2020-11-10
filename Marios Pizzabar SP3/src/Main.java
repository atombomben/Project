import java.util.Scanner;
//@Author Peter Thomsen
public class Main {

    static Scanner scan = new Scanner(System.in);
    static Menu menu;
    static DisplayMenu displayMenu;
    public static void main(String[] args) {

        displayMenu = new DisplayMenu();
        displayMenu.displayMenu();
        menu = new MainMenu();
        showMenu();

    }

    private static void showMenu(){

        menu.displayOptions();

        boolean finish =false;

        while(!finish){


            switch(scan.nextLine()){
                case "1":
                    menu.createOrder();
                    break;
                case "2":
                    menu.showOrders();
                    break;
                case "3":
                    menu.deleteOrder();
                    break;
                case "4":
                    menu.showOldOrders();
                    break;

                case "5":
                    displayMenu.closeMenu();
                    finish = true;
                    break;

                //finish = true does work but doesn't close the DisplayMenu, changed to system.exit instead
                //case "5": System.exit(0);
                //Last update using a new method closeMenu with dispose made true work again
            }
        }
    }
}
