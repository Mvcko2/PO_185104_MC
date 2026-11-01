package Human;

public class Person {
    private String firstName;
    protected String lastName;

    private String privateField = "private";
    String packagePrivateField = "package-private";
    protected String protectedField = "protected";
    public String publicField = "public";

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {

    }

    public void showInformation() {
        System.out.println("Pracownik: " + this.firstName + " " + this.lastName);
    }

    public String getFirstName() {
        return this.firstName;
    }
}