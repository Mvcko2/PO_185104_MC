package zad;

public class User {
    private String login;
    private String password;
    private int age;

    public User(String login, String password, int age) {
        if (login == null || login.isBlank()) {
            throw new IllegalArgumentException("Login nie może być pusty.");
        }
        this.login = login;
        setPassword(password);
        setAge(age);
    }

    public String getLogin() {
        return this.login;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Niepoprawny wiek.");
        }
        this.age = age;
    }

    public void setPassword(String password) {
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Hasło nie może być puste.");
        }
        this.password = password;
    }

    public boolean checkPassword(String providedPassword) {
        return this.password.equals(providedPassword);
    }

    public void showUser() {
        System.out.println("Login: " + this.login + ", wiek: " + this.age);
    }
}