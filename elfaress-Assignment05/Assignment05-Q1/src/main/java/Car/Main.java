package Car;

import Car.domain.Fleet;

/**
 * Main class to test the Car package / Fleet class
 */
public class Main {
    public static void main(String args[]) {
        //Fleet Testing
        Fleet fleet = new Fleet();
        fleet.printFuelEfficiency();
        fleet.printRange();
        System.out.println("Total Range of Fleet: " + fleet.totalRange());
    }
}
