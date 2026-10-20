public class Product {

    String name;
    double price;

    // Usunięto 'void' oraz dodano 'this.'
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void show() {
        System.out.println(name + ": " + price);
    }

}