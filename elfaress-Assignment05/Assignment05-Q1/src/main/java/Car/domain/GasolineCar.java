package Car.domain;

/**
 * Params: make, model, licensePlate, color, year, fuelTankCapacity, distanceTraveled
 * Methods: fuelEfficiency, range, refuelOrRecharge
 * Interface: Rechargeable- refuelOrRecharge
 */
public class GasolineCar extends Car {
    private double fuelTankCapacity;
    private double distanceTraveled;

    public GasolineCar(String make, String model, String licensePlate, String color, int year, double fuelTankCapacity, double distanceTraveled) {
        super(make, model, licensePlate, color, year);
        this.fuelTankCapacity = fuelTankCapacity;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public double fuelEfficiency() {
        //Miles / Gallon
        return distanceTraveled / fuelTankCapacity;
    }

    @Override
    public double range() {
        //Miles
        return fuelEfficiency() * fuelTankCapacity;
    }

    @Override
    public void refuelOrRecharge(double amount) {
        fuelTankCapacity += amount;
    }
}
