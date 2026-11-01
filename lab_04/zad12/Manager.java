package zad12;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + this.bonus;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Premia kierownicza: " + this.bonus + " zł");
    }
}