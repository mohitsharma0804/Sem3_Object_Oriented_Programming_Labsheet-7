import demo.DemoClass;

public class Intermediate5Main {
    public static void main(String[] args) {
        System.out.println("=== Intermediate Q5: Access Modifiers Across Packages ===");
        DemoClass obj = new DemoClass();
        
        System.out.println("Accessible from outside package:");
        System.out.println("Public: " + obj.pubVar);
        
        // The following lines would fail compilation if uncommented:
        // System.out.println(obj.protVar); // Protected (not subclass)
        // System.out.println(obj.defVar);  // Default (different package)
        // System.out.println(obj.privVar); // Private
        
        System.out.println("Protected, Default, and Private members are NOT directly accessible outside the package demo.");
    }
}