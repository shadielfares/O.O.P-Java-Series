package Car.domain;
/**
 * Params: make, model, licensePlate, color, year, typeCapacity, distanceTraveled, convertible
 * Methods: fuelEfficiency, range, activeateConvertible
 * Interface: Rechargeable
 */
public abstract class LuxuryCar extends Car {

    public LuxuryCar(String make, String model, String licensePlate, String color, int year, double typeCapacity, double distanceTraveled, String convertible) {
        super(make, model, licensePlate, color, year);
    }

    //Base Methods of Car
    public abstract double fuelEfficiency();
    public abstract double range();

    public String activeateConvertible(String convertible) {
        if (convertible.toLowerCase().equals("convertible")) {
            return "Convertible is active";
        } else {
            return "Convertible is not active";
        }
    }
}
