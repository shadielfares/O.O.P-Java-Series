package Car.domain;

/**
 * Params: make, model, licensePlate, color, year
 * Methods: fuelEfficiency, range
 * Interface: Rechargeable
 */

public abstract class Car implements Rechargeable {
    String make;
    String model;
    String licensePlate;
    String color;
    int year;

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }

    public Car(String make, String model, String licensePlate, String color, int year) {
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
        this.color = color;
        this.year = year;
    }

    //Methods
    public abstract double fuelEfficiency();
    public abstract double range();

}

//Interface for Recharging / Refueling
interface Rechargeable {
    void refuelOrRecharge(double amount);
}
