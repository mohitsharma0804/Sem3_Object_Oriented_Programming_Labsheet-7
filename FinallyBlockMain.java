public class FinallyBlockMain {
    public static void main(String[] args) {
        System.out.println("=== Q5: Finally Block Demonstration ===");
        
        try {
            System.out.println("File opened successfully.");
            // Simulating an operation that throws an exception
            int x = 10 / 0;
            System.out.println("This will not be printed: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled inside catch block: " + e.getMessage());
        } finally {
            System.out.println("Resource closed. (Always executed in finally block).");
        }
    }
}