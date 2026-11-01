package Job;
import Human.Person;

public class Employee extends Person {
    private String position;

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("Stanowisko: " + this.position);
    }

    public void displayData() {
        // System.out.println(this.firstName); //firstName ma dostęp private w Human.Person
        System.out.println("Imię: " + this.getFirstName());
        System.out.println("Nazwisko: " + this.lastName);
        System.out.println("Stanowisko: " + this.position);
    }

    public void testAccess() {
        // System.out.println(this.privateField);        //Brak dostępu
        // System.out.println(this.packagePrivateField); //Brak dostępu
        System.out.println(this.protectedField);         //Działa
        System.out.println(this.publicField);            //Działa
    }
}