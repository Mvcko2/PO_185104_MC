package Zad11;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    public void showInformation() {
        System.out.println("Person: " + this.name);
    }
}
