public class Car {

    String brand;
    String model;
    int productionYear;
    double mileage;

    public Car() {
        brand = "Nieznana";
        model = "Nieznany";
        productionYear = 0;
        mileage = 0.0;
    }

    public Car(
            String brand,
            String model,
            double mileage
    ) {
        this.brand = brand;
        this.model = model;
        productionYear = 2026;
        this.mileage = mileage;
    }

    public Car(
            String brand,
            String model,
            int productionYear,
            double mileage
    ) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }


    public void przejedz(double distance) {
        if (distance > 0) {
            mileage += distance;
        }
    }

    public void showInformation() {
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rok: " + productionYear);
        System.out.println("Przebieg: " + mileage + " km");
    }
    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.productionYear = other.productionYear;
        this.mileage = other.mileage;
    }
}