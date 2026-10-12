public class FinallyVsReturnMain {

    public static int testMethod() {
        try {
            System.out.println("Inside try block. Executing return statement returning 100.");
            return 100;
        } finally {
            System.out.println("Inside finally block! Executing before method officially returns.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q9: Finally vs Return ===");
        int result = testMethod();
        System.out.println("Returned value received in main: " + result);
        System.out.println("Observation: The finally block executes right before the try block returns its value.");
    }
}