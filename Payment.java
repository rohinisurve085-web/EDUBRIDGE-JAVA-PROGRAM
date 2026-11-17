
// Parent class
class Payment {

    // Method 1: Calculate amount
    double calculateAmount(double amount) {
        return amount;
    }

    // Method 2: Overloaded method with discount
    double calculateAmount(double amount, double discount) {

        return amount - (amount * discount / 100);
    }
}

// Card Payment subclass
class CardPayment extends Payment {

    // Override calculateAmount()
    @Override
    double calculateAmount(double amount) {

        double fee = amount * 0.02;  // 2% fee

        return amount + fee;
    }
}

// UPI Payment subclass
class UPIPayment extends Payment {

    // Override calculateAmount()
    @Override
    double calculateAmount(double amount) {

        double fee = amount * 0.01;  // 1% fee

        return amount + fee;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Parent class reference
        Payment p;

        // Card payment
        p = new CardPayment();

        System.out.println("--- Card Payment ---");

        System.out.println(
            "Amount with fee: " + p.calculateAmount(1000)
        );

        // UPI payment
        p = new UPIPayment();

        System.out.println("\n--- UPI Payment ---");

        System.out.println(
            "Amount with fee: " + p.calculateAmount(1000)
        );

        // Calling overloaded method
        Payment obj = new Payment();

        System.out.println("\n--- Discount Calculation ---");

        System.out.println(
            "Amount after discount: "
            + obj.calculateAmount(1000, 10)
        );
    }
}


/*
================ OUTPUT ================
--- Card Payment ---
Amount with fee: 1020.0

--- UPI Payment ---
Amount with fee: 1010.0

--- Discount Calculation ---
Amount after discount: 900.0
========================================
*/