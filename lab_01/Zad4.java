import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // BŁĄD 1: Brak średnika

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // BŁĄD 2: Zamiast "=" musi być "=="
        if (liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); // BŁĄD 3: Brak średnika
        }

        // BŁĄD 4: Zamiast "i--" musi być "i++", ponieważ mielibyśmy nieskończkona pętlę
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

//Błędy kompilacji: Brak średnika (1 i 3) oraz przypisanie = w warunku if zamiast ==
// Program w ogóle by się nie uruchomił

//Błąd w czasie działania: Pętla z i--
// Program by się uruchomił, ale pętla trwałaby w nieskończoność
// bo wartość "i" cały czas by malała i nigdy nie osiągnęłaby końca warunku i <= 5