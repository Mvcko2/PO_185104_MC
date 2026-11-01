package zad12;
public class Developer extends Employee {
    private String mainLanguage;

    public Developer(String name, double baseSalary, String mainLanguage) {
        super(name, baseSalary);
        this.mainLanguage = mainLanguage;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Główny język: " + this.mainLanguage);
    }
}