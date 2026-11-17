
// Parent class
class Shape {

    // Method to be overridden
    double area() {
        return 0;
    }
}

// Circle subclass
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding area()
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding area()
    @Override
    double area() {
        return length * breadth;
    }
}

// Triangle subclass
class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding area()
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Creating Shape reference array
        Shape[] shapes = new Shape[3];

        // Storing subclass objects
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10, 5);
        shapes[2] = new Triangle(8, 6);

        // Calling area() using loop
        for (int i = 0; i < shapes.length; i++) {

            System.out.println(
                "Area of Shape " + (i + 1) + ": "
                + shapes[i].area()
            );
        }
    }
}



/*
================ OUTPUT ================
Area of Shape 1: 78.53981633974483
Area of Shape 2: 50.0
Area of Shape 3: 24.0
========================================
*/