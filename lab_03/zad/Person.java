package zad;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Imię nie może być puste ani null.");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("Wiek musi należeć do przedziału 0 - 150.");
        }
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("Email musi zawierać znak @.");
        }
        this.email = email;
    }
}
