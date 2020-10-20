package Task2;

import java.util.ArrayList;

public class Building {

    private final ArrayList<Room> rooms;
    private final int numberOfRooms;
    private final int numberOfFloors;
    private final boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms, int numberOfRooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

}
