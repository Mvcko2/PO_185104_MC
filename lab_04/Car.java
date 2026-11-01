public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void showInformation() {
        System.out.println("Marka: " + this.getBrand()
                + ", Model: " + this.getModel()
                + ", Liczba drzwi: " + this.numberOfDoors);
    }
}