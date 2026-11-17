
class Calculator {

    // Method 1: Returns the sum of two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Method 2: Returns the product of two doubles
    double calculate(double a, double b) {
        return a * b;
    }

    // Method 3: Returns the largest of three integers
    int calculate(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Method 4: Returns the difference as a double
    double calculate(int a, double b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Sum: " + obj.calculate(10, 20));

        System.out.println("Product: " + obj.calculate(5.5, 2.0));

        System.out.println("Largest: " + obj.calculate(10, 25, 15));

        System.out.println("Difference: " + obj.calculate(20, 5.5));
    }
}

/*
================ OUTPUT ================
Sum: 30
Product: 11.0
Largest: 25
Difference: 14.5
========================================
*/