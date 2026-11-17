class Students {
    int marks;

    student(int marks) {
        this.marks = marks;
    }
}

public class Main {
    static void change(int x, Student s) {
        x = 100;
        s.marks = 95;
        s = new Student(50);
    }

    public static void main(String[] args) {
        int n = 20;
        Student st = new Student(60);

        change(n, st);

        System.out.println(n);
        System.out.println(st.marks);
    }
}


/*
================ OUTPUT ================
20
95
========================================
*/