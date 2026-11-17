
class Complex {

    double real;
    double imaginary;

    // Constructor
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    // Addition of two complex numbers
    Complex add(Complex c) {
        return new Complex(
            real + c.real,
            imaginary + c.imaginary
        );
    }

    // Multiplication of two complex numbers
    Complex multiply(Complex c) {
        double r = (real * c.real) -
                   (imaginary * c.imaginary);

        double i = (real * c.imaginary) +
                   (imaginary * c.real);

        return new Complex(r, i);
    }

    // Compare magnitudes of two complex numbers
    void compareMagnitude(Complex c) {
        double mag1 = Math.sqrt(
            real * real + imaginary * imaginary
        );

        double mag2 = Math.sqrt(
            c.real * c.real + c.imaginary * c.imaginary
        );

        if (mag1 > mag2) {
            System.out.println("First complex number is larger.");
        } 
        else if (mag1 < mag2) {
            System.out.println("Second complex number is larger.");
        } 
        else {
            System.out.println("Both have equal magnitude.");
        }
    }

    // Return a copy of the current object
    Complex copy() {
        return new Complex(real, imaginary);
    }

    // Display complex number
    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }

    public static void main(String[] args) {

        // Creating two complex number objects
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        // Addition
        Complex sum = c1.add(c2);
        System.out.print("Addition: ");
        sum.display();

        // Multiplication
        Complex product = c1.multiply(c2);
        System.out.print("Multiplication: ");
        product.display();

        // Compare magnitudes
        System.out.print("Magnitude Comparison: ");
        c1.compareMagnitude(c2);

        // Copying object
        Complex c3 = c1.copy();

        System.out.print("Copied Object: ");
        c3.display();

        // Modify original object
        c1.real = 10;
        c1.imaginary = 20;

        System.out.print("Modified Original Object: ");
        c1.display();

        System.out.print("Copied Object After Modification: ");
        c3.display();
    }
}


/*
================ OUTPUT ================
First Complex Number: 3.0 + 4.0i
Second Complex Number: 2.0 + 5.0i
Addition: 5.0 + 9.0i
Multiplication: -14.0 + 23.0i
Magnitude Comparison: Second complex number is larger.
Copied Object: 3.0 + 4.0i
Modified Original Object: 10.0 + 20.0i
Copied Object After Modification: 3.0 + 4.0i
========================================
*/