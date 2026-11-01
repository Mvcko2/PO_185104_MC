package Zad11;

public class Student extends Person {
    private int albumNumber;

    public Student(String name, int albumNumber) {
        super(name);
        this.albumNumber = albumNumber;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Student: " + this.getName() + ", album: " + this.albumNumber);
    }
}