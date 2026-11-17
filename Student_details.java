class Student {

    // Final variable: Maximum marks per subject
    final int MAX_MARKS = 100;

    // Static variable to count students
    static int studentCount = 0;

    // Private data members
    private String usn;
    private String name;
    private int marks1, marks2, marks3;

    // Constructor
    Student(String usn, String name,
            int marks1, int marks2, int marks3) {

        this.usn = usn;
        this.name = name;

        // Validate marks before assigning
        this.marks1 = validateMarks(marks1);
        this.marks2 = validateMarks(marks2);
        this.marks3 = validateMarks(marks3);

        studentCount++;
    }

    // Validation method
    private int validateMarks(int marks) {
        if (marks >= 0 && marks <= MAX_MARKS) {
            return marks;
        } else {
            System.out.println("Invalid marks! Setting marks to 0.");
            return 0;
        }
    }

    // Getter methods
    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    // Calculate total marks
    public int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Calculate average marks
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Display basic student details
    public void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    // Overloaded display method for result
    public void display(boolean result) {
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }

    // Return a new object containing result summary
    public StudentResult getResultSummary() {
        return new StudentResult(
            usn, name, calculateTotal(), calculateAverage()
        );
    }

    // Display total number of students
    public static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }
}

// Separate class for result summary
class StudentResult {

    private String usn;
    private String name;
    private int total;
    private double average;

    StudentResult(String usn, String name,
                  int total, double average) {
        this.usn = usn;
        this.name = name;
        this.total = total;
        this.average = average;
    }

    void displaySummary() {
        System.out.println("\n--- Result Summary ---");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Creating student objects
        Student s1 = new Student(
            "1AB23CS001", "Rahul", 85, 90, 80
        );

        Student s2 = new Student(
            "1AB23CS002", "Priya", 75, 88, 92
        );

        // Display basic details
        System.out.println("--- Student Details ---");
        s1.display();

        // Display result using overloaded method
        System.out.println("\n--- Student Result ---");
        s1.display(true);

        // Display second student
        System.out.println("\n--- Second Student ---");
        s2.display();
        s2.display(true);

        // Get and display result summary object
        StudentResult r1 = s1.getResultSummary();
        r1.displaySummary();

        // Display student count
        Student.displayStudentCount();
    }
}


/*
================ OUTPUT ================
--- Student Details ---
USN: 1AB23CS001
Name: Rahul

--- Student Result ---
Marks 1: 85
Marks 2: 90
Marks 3: 80
Total: 255
Average: 85.0

--- Second Student ---
USN: 1AB23CS002
Name: Priya
Marks 1: 75
Marks 2: 88
Marks 3: 92
Total: 255
Average: 85.0

--- Result Summary ---
USN: 1AB23CS001
Name: Rahul
Total Marks: 255
Average: 85.0

Total Students: 2
========================================
*/
