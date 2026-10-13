import java.util.Scanner;

public class Zad2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n=scanner.nextInt();

        if(n%2==0){
            System.out.println("Liczba jest parzysta.");
        }
        else{
            System.out.println("Liczba nie jest parzysta");
        }

        if (n % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3.");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3.");
        }

        int suma = 0;
        int parzyste = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
            if (i % 2 == 0) {
                parzyste++;
            }
        }

        System.out.println("Suma: " + suma);
        System.out.println("Liczb parzystych: " + parzyste);

        scanner.close();


    }

}