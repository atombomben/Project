package Task1;

public class Car {

    private String make;
    private String model;
    private String bodyStyle;
    private Driver driver;
    private int year;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car(String make, String model, String bodyStyle, int year) {
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.year = year;
    }

    @Override
    public String toString() {
        return "make: " + make + ". model: " + model +" ("+year+"), bodyStyle: " + bodyStyle;
    }
}
