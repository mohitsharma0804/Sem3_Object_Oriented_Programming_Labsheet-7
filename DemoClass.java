package demo;

public class DemoClass {
    public String pubVar = "Public Variable";
    protected String protVar = "Protected Variable";
    String defVar = "Default Variable";
    private String privVar = "Private Variable";

    public void showAccess() {
        System.out.println("Inside DemoClass:");
        System.out.println(" - " + pubVar);
        System.out.println(" - " + protVar);
        System.out.println(" - " + defVar);
        System.out.println(" - " + privVar);
    }
}