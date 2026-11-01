import Job.Manager;
import Zad11.Student;
import  zad12.*;

public class Main {

    static void main() {
        System.out.println("----------zad1----------");

        //1.firstName nie działa bezpośrednio, bo jest oznaczone jako private, więc widzi je tylko klasa Person – w podklasie trzeba użyć gettera getFirstName()
        //2.lastName działa bez problemu, bo ma modyfikator protected, który pozwala na bezpośredni dostęp w podklasie
        //3.Dawanie wszędzie protected zamiast private nie zawsze jest lepsze, bo psuje hermetyzację (każda podklasa może dowolnie zmieniać to pole). Bezpieczniej zostawić pole jako private i udostępnić je przez getter/setter

        System.out.println("----------zad2----------");

        System.out.println("----------zad3----------");
        Car car=new Car("Audi", "A4", 4);
        car.showInformation();

        System.out.println("----------zad4----------");
        //A
        //B
        //C
        C c=new C();

        System.out.println("----------zad5----------");
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();

        System.out.println("----------zad6----------");
        Manager menadzer = new Manager("Marek", "Czajkowski", "Menadżer", "Biuro obsługi klienta");
        menadzer.showInformation();

        System.out.println("----------zad7----------");
        Laptop laptop = new Laptop("Dell", 16, 68);
        laptop.turnOn();
        laptop.runOperatingSystem();
        laptop.checkBattery();

        System.out.println("----------zad8----------");
        Book book = new Book("Lalka", "Bolesław Prus", 1890);
        System.out.println(book);
        System.out.println(book.getClass());

        System.out.println("----------zad9----------");
        RPG game = new RPG();
        game.initialize();
        game.start();


        System.out.println("----------zad10----------");
        Report report = new Report();
        Report copiedReport = report.copy();
        System.out.println(copiedReport.getClass());
        //Kod kompiluje się

        System.out.println("----------zad11----------");
        Student student = new Student("Mikołaj", 123456);
        student.showInformation();

        System.out.println("----------zad12----------");
        Developer dev = new Developer("Kamil", 10000, "Java");
        zad12.Manager manager = new zad12.Manager("Zofia", 15000, 3000);
        Tester tester = new Tester("Adam", 8000, "Automatyczne");

        dev.showInfo();
        manager.showInfo();
        tester.showInfo();
        //Developer IS-A Employee – programista jest rodzajem pracownika.
        // Manager IS-A Employee – menedżer jest rodzajem pracownika.
        // Tester IS-A Employee – tester jest rodzajem pracownika.

    }
}