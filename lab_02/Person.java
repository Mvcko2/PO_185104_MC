public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    //Zadanie 7
    public Person(Person other) {
        this.name = other.name;
    }

    public void introduceYourself() {
        System.out.println("Cześć, mam na imię " + name + ".");
    }

}