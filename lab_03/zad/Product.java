package zad;

public class Product {
    public static final int MAX_PRODUCTS = 3;

    private String name;
    private double price;
    private static int numberOfProducts = 0;

    public Product(String name, double price) {
        if (numberOfProducts >= MAX_PRODUCTS) {
            throw new IllegalStateException("Przekroczono maksymalną liczbę produktów: " + MAX_PRODUCTS);
        }
        this.name = name;
        this.price = price;
        numberOfProducts++;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}