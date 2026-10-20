public class Dog {

    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark(){
        System.out.println("Wow Wow");
    }

    public void showInformation(){
        System.out.println("Nazwa: " + name);
        System.out.println("Rasa: " + breed);
        System.out.println("Wiek: " + age);
    }

}
