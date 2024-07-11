class Vehicle {
    String brand;
    int year;

    // Default Constructor
    public Vehicle() {
        System.out.println("Vehicle object is created using the default constructor.");
    }

    // Parameterized Constructor
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle object is created using the parameterized constructor. Brand: " + brand);
    }

    // Overloaded Parameterized Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle object is created using the overloaded parameterized constructor. Brand: " + this.brand + ", Year: " + this.year);
    }

    // Another Overloaded Constructor
    public Vehicle(int year) {
        // Calling another constructor using 'this'
        this("Calling Constructor", year);
    }
}

class Car extends Vehicle {
    // Default Constructor
    public Car() {
        System.out.println("I am the default constructor of the Car class.");
    }

    // Parameterized Constructor
    public Car(String brand, int year) {
        super(brand); // Calling the parameterized constructor of the superclass (Vehicle)
        this.year = year;
        System.out.println("Car object created using parameterized constructor. Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String args[]) {
        System.out.println("Creating an object of Vehicle with the default constructor");
        Vehicle v1 = new Vehicle();

        System.out.println("\nCreating an object of Vehicle with the parameterized constructor");
        Vehicle v2 = new Vehicle("ABC");

        System.out.println("\nCreating an object of Vehicle with the overloaded parameterized constructor");
        Vehicle v3 = new Vehicle("DEF", 2024);

        System.out.println("\nCreating an object of Vehicle to call another constructor");
        Vehicle v4 = new Vehicle(1900);

        System.out.println("\nCreating an object of the subclass Car, which extends the superclass Vehicle");
        Car c1 = new Car();

        System.out.println("\nChecking the use of constructors in inheritance");
        Car c2 = new Car("XYZ", 2020);
    }
}
