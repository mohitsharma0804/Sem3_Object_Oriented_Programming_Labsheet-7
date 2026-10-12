// To compile and run via command line:
// javac -d . college/students/Student.java Intermediate10Main.java
// java Intermediate10Main

import college.students.Student;

public class Intermediate10Main {
    public static void main(String[] args) {
        System.out.println("=== Intermediate Q10: Command-line Packaging & Compilation ===");
        Student student = new Student("Rahul Verma", 405);
        student.display();
    }
}