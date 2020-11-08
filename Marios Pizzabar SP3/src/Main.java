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
                    //finish = true didn't work for some reason, changed to system.exit instead
                case "5": System.exit(0);
                    break;

            }
        }
    }
}
