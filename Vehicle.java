
// Parent class
class Vehicle {

    String brand;

    // Parent constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Parent display method
    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

// Child class
class Car extends Vehicle {

    // Child class has its own brand field
    String brand;

    // Child constructor
    Car(String parentBrand, String childBrand) {

        // Calling parent constructor
        super(parentBrand);

        // Initializing child class field
        this.brand = childBrand;
    }

    // Overriding display method
    @Override
    void display() {

        // Calling parent class display method
        super.display();

        // Displaying child class brand
        System.out.println("Car Brand: " + brand);

        // Accessing parent class field
        System.out.println("Parent Brand using super: "
                           + super.brand);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Creating Car object
        Car c = new Car("Toyota", "BMW");

        // Calling overridden display method
        c.display();
    }
}


/*
================ OUTPUT ================
Vehicle Brand: Toyota
Car Brand: BMW
Parent Brand using super: Toyota
========================================
*/