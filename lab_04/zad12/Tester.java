package zad12;

public class Tester extends Employee {
    private String testingType;

    public Tester(String name, double baseSalary, String testingType) {
        super(name, baseSalary);
        this.testingType = testingType;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Typ testów: " + this.testingType);
    }
}