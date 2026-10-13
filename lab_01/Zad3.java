import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liczby = new int[10];

        System.out.println("Podaj 10 liczb całkowitych:");

        for (int i = 0; i < 10; i++) {
            liczby[i] = scanner.nextInt();
        }

        int max = liczby[0];
        int min = liczby[0];
        int suma = 0;

        for (int i = 0; i < liczby.length; i++) {

            if (liczby[i] > max) {
                max = liczby[i];
            }

            if (liczby[i] < min) {
                min = liczby[i];
            }

            suma = suma + liczby[i];
        }

        double srednia = (double) suma / liczby.length;

        int powyzejSredniej = 0;

        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] > srednia) {
                powyzejSredniej++;
            }
        }

        System.out.println("Największa: " + max);
        System.out.println("Najmniejsza: " + min);
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Liczb większych od średniej: " + powyzejSredniej);

        scanner.close();
    }
}