import java.util.Scanner;
//Peter Thomsen
public class Main {

    static Scanner scan = new Scanner(System.in);
    static Menu menu;

    public static void main(String[] args) {
        //Testunit
        //MainTest.pizzaTest();
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
                case "5": finish = true;
                    break;


            }
        }
    }
}
