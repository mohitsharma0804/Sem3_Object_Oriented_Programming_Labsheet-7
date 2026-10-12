// (a) Using import statement
import animals.Dog;

public class Intermediate6Main {
    public static void main(String[] args) {
        System.out.println("=== Intermediate Q6: Import vs Fully Qualified Name ===");
        
        // Method 1: Using import statement
        Dog dog1 = new Dog();
        dog1.bark();

        // Method 2: Using fully qualified name (no import needed)
        animals.Dog dog2 = new animals.Dog();
        dog2.bark();

        System.out.println("Comparison: Import statement allows cleaner code, while fully qualified name avoids naming conflicts.");
    }
}