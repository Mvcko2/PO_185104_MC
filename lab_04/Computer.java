public class Computer extends Device {
    private int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }

    public void runOperatingSystem() {
        System.out.println("System uruchomiony (RAM: " + this.ramGb + " GB).");
    }
}