package Car.domain;

public class HybridCar extends Car {
    private double batteryCapacity;
    private double distanceTraveled;
    private double fuelCapacity;
    private double fuelConsumed;
    private double typeFuelCapacity;
    private double typeFuelConsumed;

    public HybridCar(String make, String model, String licensePlate, String color, int year, double batteryCapacity, double fuelCapacity, double distanceTraveled, double fuelConsumed) {
        super(make, model, licensePlate, color, year);
        this.batteryCapacity = batteryCapacity;
        this.distanceTraveled = distanceTraveled;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumed = fuelConsumed;
    }

    //HybridCar with no battery OR is car with only gas
    //This is neccesary as method overloading only cares baout the method signature / type of parameters
    public HybridCar(String make, String model, String licensePlate, String color, int year, double typeFuelCapacity, double distanceTraveled, double typeFuelConsumed) {
        super(make, model, licensePlate, color, year);
        this.distanceTraveled = distanceTraveled;
        this.typeFuelCapacity = typeFuelCapacity;
        this.typeFuelConsumed = typeFuelConsumed;
    }

    //True Hybrid Car (Half-Half)
    @Override
    public double fuelEfficiency() {
        //Miles / kWh
        return distanceTraveled / ((batteryCapacity + fuelCapacity) /2);
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

    //Hybrid Car with no battery OR is car with only gas
    public double fuelEfficiency(double typeFuelCapacity) {
        //Miles / kWh
        return distanceTraveled / (typeFuelCapacity);
    }

    public double range(double typeFuelCapacity) {
        //Miles
        return fuelEfficiency() * typeFuelCapacity;
    }

    public void refuelOrRecharge(double amount, double typeFuelCapacity) {
        typeFuelCapacity += amount;
    }
}
