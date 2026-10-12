import java.util.ArrayList;
import java.util.Scanner;

public class Intermediate8Main {
    public static void main(String[] args) {
        System.out.println("=== Intermediate Q8: Using Java Built-in Package (java.util) ===");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter 3 item names:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            list.add(scanner.next());
        }

        System.out.println("Items stored in ArrayList: " + list);
        scanner.close();
    }
}