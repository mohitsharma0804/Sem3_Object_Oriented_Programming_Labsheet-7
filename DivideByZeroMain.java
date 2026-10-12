import java.util.Scanner;

public class DivideByZeroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Q1: Divide by Zero Exception ===");
        try {
            System.out.print("Enter numerator (integer): ");
            int num1 = scanner.nextInt();
            System.out.print("Enter denominator (integer): ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Division by zero is not allowed! (" + e.getMessage() + ")");
        } finally {
            System.out.println("Finally block executed: Resource cleanup completed.");
        }
        scanner.close();
    }
}