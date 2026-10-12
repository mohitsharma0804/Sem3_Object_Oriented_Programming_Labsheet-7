import java.util.Scanner;

public class NestedTryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {50, 100, 150, 200};

        System.out.println("=== Q4: Nested Try Blocks ===");
        try {
            // Outer try block: Division
            System.out.print("Enter divisor index to divide 1000 by numbers[index]: ");
            int index = scanner.nextInt();

            try {
                // Inner try block: Array access
                int val = numbers[index];
                int result = 1000 / val;
                System.out.println("Result (1000 / numbers[" + index + "]): " + result);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index out of bounds (" + e.getMessage() + ")");
            }

        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Arithmetic error encountered (" + e.getMessage() + ")");
        } catch (Exception e) {
            System.out.println("Outer Catch: General exception encountered.");
        }
        scanner.close();
    }
}