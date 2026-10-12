import java.util.Scanner;

public class ArrayIndexOutOfBoundsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("=== Q2: Array Index Out of Bounds ===");
        System.out.println("Array created with 5 elements (valid indices: 0 to 4).");
        
        try {
            System.out.print("Enter an index to access (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Invalid index! Please enter an index between 0 and 4.");
        } finally {
            System.out.println("Execution finished.");
        }
        scanner.close();
    }
}