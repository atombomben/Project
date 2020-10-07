package Task1;

public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Peter", 25);
        Car car1 = new Car ("Hyundai", "i10", "Sedan", 2019);
        Car car2 = new Car ("Mazda", "MX5", "Cabriolet", 1997);
        car1.setDriver(driver1);
        System.out.println(car1.toString());
        System.out.println(car1.getDriver().toString());
        car2.setDriver(driver1);
        System.out.println(car2.toString());
        System.out.println(car2.getDriver().toString());
    }


}
