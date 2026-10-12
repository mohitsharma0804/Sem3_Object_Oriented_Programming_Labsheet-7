import java.util.Scanner;

// Custom User-Defined Exception
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class CustomExceptionMain {
    
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password is too short! Must be at least 6 characters long.");
        }
        System.out.println("Password is valid and accepted.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Q7: Custom User-Defined Exception ===");
        System.out.print("Enter password: ");
        String pwd = scanner.next();

        try {
            validatePassword(pwd);
        } catch (InvalidPasswordException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
        scanner.close();
    }
}