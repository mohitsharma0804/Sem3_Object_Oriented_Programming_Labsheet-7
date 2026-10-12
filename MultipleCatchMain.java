import java.util.Scanner;

public class MultipleCatchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Q3: Multiple Catch Blocks ===");

        try {
            System.out.print("Enter first number as string: ");
            String str1 = scanner.next();
            System.out.print("Enter second number as string: ");
            String str2 = scanner.next();

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid string format entered. Please provide valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        } finally {
            System.out.println("Multiple catch demonstration complete.");
        }
        scanner.close();
    }
}