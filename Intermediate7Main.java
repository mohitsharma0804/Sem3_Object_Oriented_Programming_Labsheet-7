// Wildcard import to access all classes in mypackage
import mypackage.*;

public class Intermediate7Main {
    public static void main(String[] args) {
        System.out.println("=== Intermediate Q7: Wildcard Import (package.*) ===");
        A a = new A();
        B b = new B();
        C c = new C();

        a.msg();
        b.msg();
        c.msg();
    }
}