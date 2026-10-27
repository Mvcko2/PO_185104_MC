package zad;

public class InitializationDemo {
    private static String staticField = initStaticField();
    private String instanceField = initInstanceField();

    static {
        System.out.println("Blok statyczny");
    }

    {
        System.out.println("Blok instancyjny");
    }

    public InitializationDemo() {
        System.out.println("Konstruktor");
    }

    private static String initStaticField() {
        System.out.println("Pole statyczne");
        return "statyczne";
    }

    private String initInstanceField() {
        System.out.println("Pole instancji");
        return "instancyjne";
    }
}