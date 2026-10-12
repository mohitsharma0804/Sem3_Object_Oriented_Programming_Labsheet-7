import utils.MathUtils;

public class Intermediate9Main {
    public static void main(String[] args) {
        System.out.println("=== Intermediate Q9: Utility Package and Reuse ===");
        int x = 20, y = 10;
        System.out.println("Addition (20 + 10)     : " + MathUtils.add(x, y));
        System.out.println("Subtraction (20 - 10)  : " + MathUtils.subtract(x, y));
        System.out.println("Multiplication (20 * 10): " + MathUtils.multiply(x, y));
    }
}