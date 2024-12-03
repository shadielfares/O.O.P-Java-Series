package Car.domain;

/**
 * Params: make, model, licensePlate, color, year, batteryCapacity, distanceTraveled
 * Methods: fuelEfficiency, range, refuelOrRecharge
 * Interface: Rechargeable- refuelOrRecharge
 */
public class ElectricCar extends Car {
    private double batteryCapacity;
    private double distanceTraveled;

    public ElectricCar(String make, String model, String licensePlate, String color, int year, double batteryCapacity, double distanceTraveled) {
        super(make, model, licensePlate, color, year);
        this.batteryCapacity = batteryCapacity;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public double fuelEfficiency() {
        //Miles / kWh
        return distanceTraveled / batteryCapacity;
    }
    @Override
    public double range() {
        //Miles
        return fuelEfficiency() * batteryCapacity;
    }
    @Override
    public void refuelOrRecharge(double amount) {
        batteryCapacity += amount;
    }
}
