package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Room room1 = new Room("Yellow", 1, 2, 3);
    Room room2 = new Room("Gray", 2, 5, 0);
    Room room3 = new Room("Black", 3, 7, 5);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

    Building building1 = new Building(rooms, 5, 6, false);
    int totalLamps = 0;
       for (int i = 0; i < rooms.size(); i++) {
           totalLamps = totalLamps + building1.getRooms().get(i).getNumberOfLamps();


           System.out.println("Number of lamps is " + totalLamps);
       }

    if (building1.getNumberOfFloors() > building1.getNumberOfRooms()) {
        System.out.println("This is an odd building");
    }

    }
}
