
// Parent class
class Person {

    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {

        System.out.println("Person constructor executed");

        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class of Person
class Employee extends Person {

    int employeeId;
    double basicSalary;

    // Parameterized constructor
    Employee(String name, int age,
             int employeeId, double basicSalary) {

        super(name, age);

        System.out.println("Employee constructor executed");

        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    @Override
    void display() {
        super.display();

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Child class of Employee
class Manager extends Employee {

    String department;
    double bonus;

    // Parameterized constructor
    Manager(String name, int age, int employeeId,
            double basicSalary, String department,
            double bonus) {

        super(name, age, employeeId, basicSalary);

        System.out.println("Manager constructor executed");

        this.department = department;
        this.bonus = bonus;
    }

    // Calculate total salary
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void display() {
        super.display();

        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        System.out.println("Creating Manager Object...\n");

        // Creating Manager object
        Manager m = new Manager(
            "Rahul",
            35,
            101,
            50000,
            "Computer Science",
            10000
        );

        System.out.println("\n--- Manager Details ---");

        m.display();
    }
}


/*
================ OUTPUT ================
Creating Manager Object...

Person constructor executed
Employee constructor executed
Manager constructor executed

--- Manager Details ---
Name: Rahul
Age: 35
Employee ID: 101
Basic Salary: 50000.0
Department: Computer Science
Bonus: 10000.0
Total Salary: 60000.0
========================================
*/