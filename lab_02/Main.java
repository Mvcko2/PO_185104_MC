public class Main {


    public static void main() {
        //Zad1
        System.out.println("------------------ZAD 1------------------");
        Dog pies1 = new Dog("Reksio", "Kundel", 5);
        Dog pies2 = new Dog("Ares", "Owczarek niemiecki", 2);
        pies1.bark();
        pies1.showInformation();
        pies2.bark();
        pies2.showInformation();

        //Zad2
        System.out.println("------------------ZAD 2------------------");
        Point punkt1 = new Point(2.2, 3.5);
        Point punkt2 = new Point(4.2, 1.2);
        punkt2.distance(punkt1);

        //Zad3
        System.out.println("------------------ZAD 3------------------");
        Book book1 = new Book();
        Book book2 = new Book("Harry Potter", "JK Rowling");
        Book book3 = new Book("Wiedźmin", "Sapkowski", 1999);

        //Zad4 i  Zad5
        System.out.println("------------------ZAD 4 i 5------------------");
        Car original = new Car("Audi", "A4", 2020, 45000);
        Car copy = new Car(original);
        original.przejedz(333);
        original.showInformation();
        copy.showInformation();

        //zad6 i 7
        System.out.println("------------------ZAD 6 i 7------------------");
        Person first = new Person("Anna");
        Person second = first;
        second.name = "Maria";
        first.introduceYourself();
        second.introduceYourself();
        Person third = new Person(first);
        third.name = "Katarzyna";
        first.introduceYourself();
        third.introduceYourself();
        //Odpowiedzi do Zadania 6:
        //Ile obiektów Person powstało?
        //Powstał tylko 1 obiekt.
        //Ile istnieje referencji?
        //Istnieją 2 referencje first oraz second.
        //Dlaczego zmiana wykonana przez second jest widoczna również przez first?
        //Ponieważ obie zmienne przechowują referencję do tego samego obiektu.
        //Odpowiedź do Zadania 7 (różnica między przypadkami):
        //Person second = first; – kopiuje wyłącznie samą referencję, obie zmienne wskazują na ten sam obiekt.
        //Person second = new Person(first); – tworzy drugi, obiekt i inicjalizuje jego pole wartością z obiektu first.

        //zad8
        System.out.println("------------------ZAD 8------------------");
        Counter c1 = new Counter(0);
        Counter c2 = new Counter(10);
        c1.increaseOther(c2);
        System.out.println("Wartość c1: " + c1.value);
        System.out.println("Wartość c2: " + c2.value);
        //Parametr other wewnątrz metody wskazuje obiekt c2, dzięki czemu metoda może zmodyfikować jego pola.

        //zad9
        System.out.println("------------------ZAD 9------------------");
        Car car = null;
        if (car != null) {
            car.showInformation();
        } else {
            System.out.println("Obiekt car ma wartość null – nie można wywołać metody.");
        }

        //zad10
        System.out.println("------------------ZAD 10------------------");
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value); //20
        System.out.println(b.value); //20
        System.out.println(c.value); //30

        System.out.println(a == b); //true
        System.out.println(a == c); //false
        //a ______
        //       |----> Box1
        //b ------
        //c ------> Box2

        //zad11
        System.out.println("------------------ZAD 11------------------");
        Product product = new Product("Monitor", 1200);
        product.show();

        //zad12
        System.out.println("------------------ZAD 12------------------");
        Movie movie = new Movie("Diuna: Część druga", "Sci-Fi", 166);
        Screening eveningScreening = new Screening(movie, "20:30", 50);

        Viewer viewer1 = new Viewer("Jan");
        Viewer viewer2 = new Viewer("Klara");
        Viewer viewer4 = new Viewer("Ania");

        eveningScreening.showScreeningInfo();
        System.out.println();

        viewer1.buyTicket(eveningScreening, 3);
        viewer2.buyTicket(eveningScreening, 48);
        viewer2.buyTicket(eveningScreening, 2);

        System.out.println();
        eveningScreening.showScreeningInfo();

    }

}