import java.util.Scanner;

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: $" + balance + ", Requested: $" + amount);
        }
        balance -= amount;
        System.out.println("Successfully withdrew $" + amount + ". Remaining balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingExceptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(500.0);

        System.out.println("=== Q10: Banking Example (Custom + Built-in Exceptions) ===");
        System.out.println("Account Initial Balance: $500.0");

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Built-in Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
        scanner.close();
    }
}