import java.util.Scanner;

public class ThrowsKeywordMain {

    // Method declaring that it throws NumberFormatException
    public static int readAndConvertNumber() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric string to convert: ");
        String input = scanner.next();
        // Integer.parseInt throws NumberFormatException if input is non-numeric
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        System.out.println("=== Q8: Using throws Keyword ===");
        try {
            int convertedValue = readAndConvertNumber();
            System.out.println("Successfully converted to integer: " + convertedValue);
        } catch (NumberFormatException e) {
            System.out.println("Caught exception in main via throws declaration: Invalid number format.");
        }
    }
}