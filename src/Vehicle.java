public abstract class Vehicle {
    protected String brand; [cite: 16]
    protected int year; [cite: 18]
    protected Driver driver; // Агрегация/Композиция [cite: 66, 67]

    public Vehicle(String brand, int year, Driver driver) {
        this.brand = brand;
        this.year = year;
        this.driver = driver; [cite: 20, 21]
    }

    public abstract void startEngine(); [cite: 24]
    public abstract void stopEngine(); [cite: 25]

    public void displayInfo() {
        System.out.println("Vehicle: " + brand + ", Year: " + year); [cite: 27]
    }

}
