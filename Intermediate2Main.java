import shapes.Circle;
import shapes.Rectangle;

public class Intermediate2Main {
    public static void main(String[] args) {
        System.out.println("=== Intermediate Q2: Package with Multiple Classes ===");
        Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4.0, 6.0);

        System.out.printf("Circle Area (radius 5): %.2f\n", c.area());
        System.out.println("Rectangle Area (4 x 6): " + r.area());
    }
}