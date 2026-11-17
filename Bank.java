
class BankAccount {

    // Private data members
    private String accountNumber;
    private double balance;

    // Static variable to count accounts
    static int accountCount = 0;

    // Final account identifier
    final int accountId;

    // Constructor
    BankAccount(String accountNumber, double balance) {

        this.accountNumber = accountNumber;

        // Validate initial balance
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance!");
        }

        accountCount++;

        // Assign unique account ID
        accountId = accountCount;
    }

    // Deposit method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: " + balance);
    }

    // Static method to display account count
    public static void displayAccountCount() {
        System.out.println("Total Accounts: " + accountCount);
    }
}

// Separate testing class
public class BankTest {

    public static void main(String[] args) {

        // Creating bank account objects
        BankAccount b1 = new BankAccount("ACC101", 5000);
        BankAccount b2 = new BankAccount("ACC102", 3000);

        System.out.println("--- Account 1 ---");
        b1.display();

        System.out.println("\n--- Deposit Operation ---");
        b1.deposit(2000);

        System.out.println("\n--- Withdrawal Operation ---");
        b1.withdraw(1500);

        System.out.println("\n--- Invalid Deposit ---");
        b1.deposit(-500);

        System.out.println("\n--- Invalid Withdrawal ---");
        b1.withdraw(-200);

        System.out.println("\n--- Excess Withdrawal ---");
        b1.withdraw(10000);

        System.out.println("\n--- Final Account Details ---");
        b1.display();

        System.out.println("\n--- Account 2 ---");
        b2.display();

        // Access balance through getter
        System.out.println("\nBalance using getter: "
                           + b1.getBalance());

        // Display total number of accounts
        System.out.println();
        BankAccount.displayAccountCount();

        // Uncommenting the following line causes an error:
        // System.out.println(b1.balance);
    }
}


/*
================ OUTPUT ================
--- Account 1 ---
Account Number: ACC101
Account ID: 1
Balance: 5000.0

--- Deposit Operation ---
Deposited: 2000.0

--- Withdrawal Operation ---
Withdrawn: 1500.0

--- Invalid Deposit ---
Invalid deposit amount!

--- Invalid Withdrawal ---
Invalid withdrawal amount!

--- Excess Withdrawal ---
Insufficient balance!

--- Final Account Details ---
Account Number: ACC101
Account ID: 1
Balance: 5500.0

--- Account 2 ---
Account Number: ACC102
Account ID: 2
Balance: 3000.0

Balance using getter: 5500.0

Total Accounts: 2
========================================
*/
