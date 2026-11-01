package zad12;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return this.name;
    }

    protected double getBaseSalary() {
        return this.baseSalary;
    }

    public double calculateSalary() {
        return this.baseSalary;
    }

    public void showInfo() {
        System.out.println(this.name + " - zarobki: " + this.calculateSalary() + " zł");
    }

    @Override
    public String toString() {
        return "Employee{name='%s', salary=%.2f}".formatted(this.name, this.calculateSalary());
    }
}