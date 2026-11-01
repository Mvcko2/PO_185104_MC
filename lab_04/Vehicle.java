public class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    protected String getBrand() {
        return this.brand;
    }

    protected String getModel() {
        return this.model;
    }
}