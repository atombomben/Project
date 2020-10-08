package Task2;

public class Room {
    private final String wall;
    private final int numberOfDoors;
    private final int numberOfLamps;
    private final int numberOfWindows;



    public Room (String wall, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.wall = wall;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public String getWall() {
        return wall;
    }

    public int getNumberOfDoors() {
            return numberOfDoors;
        }

        public int getNumberOfLamps() {
            return numberOfLamps;
        }

        public int getNumberOfWindows() {
            return numberOfWindows;
        }
}
