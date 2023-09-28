package junior.oop;

class Vehicle {
    // Attributes
    private final String make;

    // Constructor
    public Vehicle(String make) {
        this.make = make;
    }

    // displayInfo() method
    public void displayInfo() {
        System.out.println("Make: " + make);
    }
}

class Car extends Vehicle {
    // Additional attributes
    private final String model;
    private final int year;

    // Constructor
    public Car(String make, String model, int year) {
        super(make);
        this.model = model;
        this.year = year;
    }

    // Override displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        // Create an object of the Car class with make, model, and year
        Car car = new Car("Honda", "Accord", 2017);

        // Display the car's information
        car.displayInfo();
    }
}
