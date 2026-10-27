package zad;

public class StaticCalculator {
    private static int numberOfOperations = 0;

    public static int add(int a, int b) {
        numberOfOperations++;
        return a + b;
    }

    public static int add(int a, int b, int c) {
        numberOfOperations++;
        return a + b + c;
    }

    public static double add(double a, double b) {
        numberOfOperations++;
        return a + b;
    }

    // public static double add(int a, int b) {
    //     return (double) (a + b);
    // }

    public static int subtract(int a, int b) {
        numberOfOperations++;
        return a - b;
    }

    public static int multiply(int a, int b) {
        numberOfOperations++;
        return a * b;
    }

    public static int getNumberOfOperations() {
        return numberOfOperations;
    }
}
