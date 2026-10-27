package app;

import animals.Cat;
import animals.Dog;
import  zad.Person;
import zad.Product;
import zad.StaticCalculator;
import  zad.InitializationDemo;
public class Main {

    static void main() {
        System.out.println("----------zad1----------");
        Cat kot = new Cat("Leo", 4);
        Dog pies = new Dog("Reksio", 5);
        kot.makeSound();
        pies.makeSound();

        System.out.println("----------zad2----------");
        //Nie wszystkie pola muszą posiadać setter
        //Na przykład wiek w wielu systemach nie powinien być ustawiany ręcznie
        //na dowolną wartość, zamiast tego można np wyliczać go na podstawie daty urodzenia.

        System.out.println("----------zad3----------");

        System.out.println("----------zad4----------");
        //1: Tak, zmiana oryginalnej tablicy po utworzeniu obiektu zmienia dane wewnątrz obiektu.
        //2: Tak, zmiana tablicy zwróconej przez getPoints() zmienia wewnętrzną tablicę obiektu.

        System.out.println("----------zad5----------");
        new Product("Chleb", 4.50);
        new Product("Mleko", 3.20);
        new Product("Masło", 7.00);

        System.out.println(Product.getNumberOfProducts());

        System.out.println("----------zad6----------");
        //new Product("Pepsi", 8.00);
        //1:Limit dotyczy całej klasy Product, więc nie ma sensu powielać tej samej wartości.
        //2:Wartość stanowi stały limit.
        //3:Jest to licznik, którego wartość musi się zmieniać przy każdym utworzeniu nowego obiektu.

        System.out.println("----------zad7 i 8----------");
        System.out.println(StaticCalculator.add(2, 3));
        System.out.println(StaticCalculator.add(2, 3, 4));
        System.out.println(StaticCalculator.add(2.5, 3.5));
        System.out.println("Operacje: " + StaticCalculator.getNumberOfOperations());

        System.out.println("----------zad9----------");
        System.out.println("---Pierwszy obiekt---");
        new InitializationDemo();
        System.out.println("---Drugi obiekt---");
        new InitializationDemo();

        System.out.println("----------zad10----------");
        //studentName w klasie Student – instancyjne, bo każdy student ma swoje własne imię, a nie jedno wspólne dla wszystkich
        //numberOfStudents w klasie Student – statyczne bo to ogólny licznik wszystkich studentów razem wziętych, więc musi być wspólny dla całej klasy.
        //PI w klasie matematycznej – statyczne bo liczba pi jest zawsze taka sama .
        //balance w klasie BankAccount – instancyjne bo każde konto w banku ma własne saldo.
        //calculateVat(double price) w bezstanowej klasie pomocniczej – statyczne bo ta metoda tylko przelicza podaną kwotę
        //carMileage w klasie Car – instancyjne bo każdy samochód ma swój własny przebieg na liczniku.
        //MAX_LOGIN_ATTEMPTS w klasie LoginPolicy – statyczne bo maksymalna liczba prób logowania to odgórna zasada taka sama dla każdego.

        System.out.println("----------zad11----------");
        //Błędy kompilacji: Metoda showUser() jest oznaczona jako static, a próbuje użyć zwykłych pól login i password.
        //Metoda statyczna nie jest przypisana do żadnego konkretnego obiektu, więc nie wie czyj login i hasło ma wypisać przez to kod się nie skompiluje.

        //Problemy projektowe:
        // -Wszystkie pola są publiczne , więc każdy może z zewnątrz zmienić je na cokolwiek bez żadnej kontroli.
        // -Wiek jest statyczny co oznacza, że wszyscy dzielą ten sam wiek
        // -Brakuje sprawdzania poprawności danych, ktoś może ustawić np. ujemny wiek.
        // -Metoda showUser() wypisuje hasło użytkownika

        //Które pola instancyjne, a które statyczne:
        //Wszystkie trzy pola login, password, age powinny być instancyjne, bo każdy użytkownik ma swój login, swoje hasło i swój wiek.

        //Czy hasło powinno mieć zwykły getter:
        //Nie, zamiast tego lepiej napisać metodę np. checkPassword() która tylko sprawdza, czy podane przy logowaniu hasło zgadza się.

        System.out.println("----------zad12----------");
        //Student.name : Pole prywatne z getterem i setterem. Imię trzeba móc odczytać, a czasem też zmienić, ale robimy to przez setter, żeby nikt nie ustawił np. pustego napisu.
        //Student.albumNumber : Pole prywatne tylko z getterem. Numer albumu dostaje się raz i jest taki sam przez całe studia.
        //Course.DEFAULT_MAX_STUDENTS : Stała public static final. Jest to odgórna wartość wspólna dla wszystkich kursów której przez final nikt nie może nadpisać.
        //Course.numberOfCreatedCourses : Pole prywatne i statyczne tylko z getterem. Licznik sam zwiększa się o 1 przy tworzeniu nowego kursu.
        //Course.name : Pole prywatne z getterem i setterem. Nazwę kursu można odczytać i zmienić, a setter pilnuje żeby nowa nazwa nie była pusta.
        //Course.maxStudents : Pole prywatne tylko z getterem, bez settera. Limit miejsc ustalamy raz przy tworzeniu kursu
        //Course.enrolledStudents i Course.currentStudentsCount : Pola prywatne bez setterów.



    }

}