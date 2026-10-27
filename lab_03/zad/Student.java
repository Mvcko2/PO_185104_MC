package zad;

public class Student {
    private String name;
    private final String albumNumber;

    public Student(String name, String albumNumber) {
        setName(name);
        if (albumNumber == null || albumNumber.isBlank()) {
            throw new IllegalArgumentException("Numer albumu nie może być pusty.");
        }
        this.albumNumber = albumNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Imię i nazwisko nie może być puste.");
        }
        this.name = name;
    }

    public String getAlbumNumber() {
        return this.albumNumber;
    }
}