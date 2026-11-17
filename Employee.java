
// Base class
class Employee {

    int employeeId;
    String name;
    double basicSalary;

    // Parent constructor
    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to be overridden
    double calculateSalary() {
        return basicSalary;
    }

    // Display employee details
    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Permanent Employee subclass
class PermanentEmployee extends Employee {

    double allowance;
    double bonus;

    PermanentEmployee(int id, String name, double salary,
                      double allowance, double bonus) {

        // Calling parent constructor
        super(id, name, salary);

        this.allowance = allowance;
        this.bonus = bonus;
    }

    // Overriding calculateSalary()
    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Allowance: " + allowance);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Contract Employee subclass
class ContractEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int id, String name, double salary,
                    int hoursWorked, double hourlyRate) {

        // Calling parent constructor
        super(id, name, salary);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Overriding calculateSalary()
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Creating employee objects
        PermanentEmployee p1 =
            new PermanentEmployee(101, "Rahul", 30000, 5000, 3000);

        ContractEmployee c1 =
            new ContractEmployee(102, "Priya", 0, 160, 250);

        // Storing both types in Employee array
        Employee[] employees = {p1, c1};

        // Displaying employee details
        for (Employee e : employees) {

            System.out.println("\n--- Employee Details ---");

            e.display();

            System.out.println();
        }
    }
}


/*
================ OUTPUT ================
--- Employee Details ---
Employee ID: 101
Employee Name: Rahul
Basic Salary: 30000.0
Allowance: 5000.0
Bonus: 3000.0
Total Salary: 38000.0


--- Employee Details ---
Employee ID: 102
Employee Name: Priya
Basic Salary: 0.0
Hours Worked: 160
Hourly Rate: 250.0
Total Salary: 40000.0
========================================
*/