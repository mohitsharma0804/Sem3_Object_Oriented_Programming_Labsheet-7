package company.employees;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Name: " + name + " | Salary: $" + salary);
    }
}