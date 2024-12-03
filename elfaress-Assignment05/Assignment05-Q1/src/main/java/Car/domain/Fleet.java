package Car.domain;

import java.util.ArrayList;
/**
 * Params: cars
 * Methods: printFuelEfficiency, printRange, totalRange
 * Interface: Rechargeable - refuelOrRecharge
 */
public class Fleet {
    private ArrayList<Car> cars;

    //Instantiate an array or list of Car objects that includes instances of GasolineCar and ElectricCar


    public Fleet() {
        cars = new ArrayList<>();
        cars.add(new GasolineCar("Toyota", "Corolla", "1234", "Red", 2010, 10, 100));
        cars.add(new GasolineCar("Toyota", "Camry", "5678", "Blue", 2015, 15, 150));
        cars.add(new ElectricCar("Tesla", "Model S", "9876", "Black", 2018, 100, 200));
        cars.add(new ElectricCar("Tesla", "Model 3", "5432", "White", 2019, 75, 150));
        cars.add(new ElectricCar("Tesla", "Model X", "1357", "Silver", 2020, 125, 250));
        cars.add(new LuxurySedan("BMW", "M3", "2468", "Black", 2021, 20, 200, "Convertible"));
    }

    public void printFuelEfficiency() {
        int lengthofCarsArray = cars.size();
        for (int i = 0; i < lengthofCarsArray; i++) {
            System.out.println(cars.get(i).getMake() + " " + cars.get(i).getModel() + " Fuel Efficiency: " + cars.get(i).fuelEfficiency());
        }
    }

    public void printRange() {
        int lengthofCarsArray = cars.size();
        for (int i = 0; i < lengthofCarsArray; i++) {
            System.out.println(cars.get(i).getMake() + " " + cars.get(i).getModel() + " Range: " + cars.get(i).range());
        }
    }

    public double totalRange() {
        double totalRange = 0;
        int lengthofCarsArray = cars.size();
        for (int i = 0; i < lengthofCarsArray; i++) {
            totalRange += cars.get(i).range();
        }
        return totalRange;
    }
}
