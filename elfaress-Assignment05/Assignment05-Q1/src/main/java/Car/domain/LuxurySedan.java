package Car.domain;

/**
 * Params: make, model, licensePlate, color, year, typeCapacity, distanceTraveled, convertible
 * Methods: fuelEfficiency, range, refuelOrRecharge
 * Interface: Rechargeable- refuelOrRecharge
 */
public class LuxurySedan extends LuxuryCar {
    private double typeCapacity;
    private double distanceTraveled;

    public LuxurySedan(String make, String model, String licensePlate, String color, int year, double typeCapacity, double distanceTraveled, String convertible) {
        super(make, model, licensePlate, color, year, typeCapacity, distanceTraveled, convertible);
        this.typeCapacity = typeCapacity;
        this.distanceTraveled = distanceTraveled;
    }

    //This was constructured with the assumption that all luxury cars are convertibles
    //Additionally, that these luxury cars can take on either gas or electric

    @Override
    public double fuelEfficiency() {
        return distanceTraveled / typeCapacity;
    }

    @Override
    public double range() {
        return fuelEfficiency() * typeCapacity;
    }

    @Override
    public void refuelOrRecharge(double amount) {
        typeCapacity += amount;
    }
}

