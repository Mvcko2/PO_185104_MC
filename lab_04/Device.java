public class Device {
    private String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void turnOn() {
        System.out.println("Urządzenie marki " + this.manufacturer + " zostało włączone.");
    }
}