import java.util.Scanner;

public class ThrowKeywordMain {
    
    // Method that explicitly throws an exception using 'throw'
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18 to register.");
        } else {
            System.out.println("Age " + age + " is valid. Access granted.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Q6: Using throw Keyword ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }
        scanner.close();
    }
}