import testpack.PublicClass;
// Note: DefaultClass cannot be imported or accessed from outside package testpack!

public class Intermediate3Main {
    public static void main(String[] args) {
        System.out.println("=== Intermediate Q3: Default and Public Classes in Package ===");
        PublicClass pub = new PublicClass();
        pub.show();

        System.out.println("Observation: Non-public (default) classes cannot be accessed outside their package.");
        // DefaultClass d = new DefaultClass(); // Compile error if uncommented
    }
}