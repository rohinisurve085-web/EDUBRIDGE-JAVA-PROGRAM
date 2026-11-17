
class University {

    String universityName;
    String location;

    // Constructor of outer class
    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    // Static nested class
    static class Department {

        String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }

    // Non-static inner class
    class Faculty {

        String facultyName;
        String designation;

        Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        void displayFaculty() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);

            // Accessing outer class members
            System.out.println("University: " + universityName);
        }
    }

    // Outer class method
    void displayUniversity() {
        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + location);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // 1. Creating University object
        University u = new University(
            "ABC University", "Bangalore"
        );

        // 2. Creating static nested class object
        // Without creating an outer object first
        University.Department d =
            new University.Department("Computer Science");

        // 3. Creating inner class object using University object
        University.Faculty f =
            u.new Faculty("Rahul", "Professor");

        // 4. Displaying all details

        System.out.println("--- University Details ---");
        u.displayUniversity();

        System.out.println("\n--- Department Details ---");
        d.displayDepartment();

        System.out.println("\n--- Faculty Details ---");
        f.displayFaculty();
    }
}


/*
================ OUTPUT ================
--- University Details ---
University Name: ABC University
Location: Bangalore

--- Department Details ---
Department: Computer Science

--- Faculty Details ---
Faculty Name: Rahul
Designation: Professor
University: ABC University
========================================
*/
