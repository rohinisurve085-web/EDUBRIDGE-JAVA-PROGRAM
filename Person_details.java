
class Person {

    // Final constant
    public static final String COLLEGE_NAME =
        "ABC College";

    // Static count
    private static int peopleCount = 0;

    // Private fields
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {

        this.name = name;
        this.age = age;

        peopleCount++;

        System.out.println("Person constructor executed");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Static getter
    public static int getPeopleCount() {
        return peopleCount;
    }

    // Method to be overridden
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Overloaded method
    public void displayDetails(String message) {
        System.out.println(message);
        displayDetails();
    }

    // Static nested class
    static class Department {

        private String departmentName;
        private String departmentHead;

        Department(String departmentName,
                   String departmentHead) {

            this.departmentName = departmentName;
            this.departmentHead = departmentHead;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
            System.out.println("Department Head: " + departmentHead);
        }
    }
}


// Student subclass
class Student extends Person {

    private String usn;
    private String course;

    Student(String name, int age, String usn, String course) {

        super(name, age);

        this.usn = usn;
        this.course = course;
    }

    @Override
    public void displayDetails() {

        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("USN: " + usn);
        System.out.println("Course: " + course);
    }
}


// Faculty subclass
class Faculty extends Person {

    private String facultyId;
    private String subject;

    Faculty(String name, int age,
            String facultyId, String subject) {

        super(name, age);

        this.facultyId = facultyId;
        this.subject = subject;
    }

    @Override
    public void displayDetails() {

        System.out.println("Faculty Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Subject: " + subject);
    }
}


// Administrator subclass
class Administrator extends Person {

    private String adminId;
    private String role;

    Administrator(String name, int age,
                  String adminId, String role) {

        super(name, age);

        this.adminId = adminId;
        this.role = role;
    }

    @Override
    public void displayDetails() {

        System.out.println("Admin Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Admin ID: " + adminId);
        System.out.println("Role: " + role);
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        System.out.println("COLLEGE MANAGEMENT SYSTEM");
        System.out.println("College: " + Person.COLLEGE_NAME);

        // Creating subclass objects
        Student s = new Student(
            "Rahul", 20, "1AB23CS001", "Computer Science"
        );

        Faculty f = new Faculty(
            "Priya", 35, "F101", "Java Programming"
        );

        Administrator a = new Administrator(
            "Arun", 40, "A101", "Principal"
        );

        // Creating nested class object
        Person.Department d =
            new Person.Department(
                "Computer Science", "Dr. Kumar"
            );

        // Storing different objects in Person array
        Person[] people = {s, f, a};

        // Runtime polymorphism
        System.out.println("\n--- PEOPLE DETAILS ---");

        for (Person p : people) {

            System.out.println("\n--------------------");

            p.displayDetails();
        }

        // Demonstrating overloaded method
        System.out.println("\n--- OVERLOADED METHOD ---");

        s.displayDetails("Student Information");

        // Display department details
        System.out.println("\n--- DEPARTMENT DETAILS ---");

        d.displayDepartment();

        // Display total people
        System.out.println("\n--- TOTAL PEOPLE ---");

        System.out.println(
            "Total People Created: " +
            Person.getPeopleCount()
        );
    }
}



/*
================ OUTPUT ================

========================================
*/