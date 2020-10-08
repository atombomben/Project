package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Room room1 = new Room("Yellow", 1, 2, 3);
    Room room2 = new Room("Gray", 2, 5, 0);
    Room room3 = new Room("Black", 3, 7, 5);
    Building building1 = new Building(room1, 5, 6, false);

    building1.getList().add(room1);
    building1.getList().add(room2);
    building1.getList().add(room3);

    int sum = room1.getNumberOfLamps() + room2.getNumberOfLamps() + room3.getNumberOfLamps();

        System.out.println("Number of lamps is " + sum);


    if (building1.getNumberOfFloors() > building1.getNumberOfRooms()) {
        System.out.println("This is an odd building");
    }

    }
}
