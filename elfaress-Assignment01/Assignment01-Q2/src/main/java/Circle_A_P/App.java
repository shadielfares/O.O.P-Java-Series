package Circle_A_P;

import java.util.Scanner;

public class App {
    // Instantiate Super class and Core Methods
    public abstract class Shape {
        public abstract double calculateArea();
        public abstract double calculatePerimeter();
    }

    // Sub-Class Circle
    public class Circle extends Shape {

        // Initialize variables
        
        double radius;
        double area;
        double perimeter;

        // Circle Instance
        public Circle(double radius) {
            this.radius = radius;
        }

        // Specific Area and Perimeter methods
        @Override
        public double calculateArea() {
            area = Math.PI * Math.pow(radius, 2);
            return area;
        }

        @Override
        public double calculatePerimeter() {
            perimeter = 2 * Math.PI * radius;
            return perimeter;
        }
    }
    public static void main(String[] args) {
        try {
            // Retrieve input.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a radius between 0.0 - 10.0: ");
            double radius = scanner.nextDouble();

            // Initialize App Class and Circle Sub-Class  
            App app = new App();
            Circle myCircle = app.new Circle(radius);

            // Check case conditions.
            if (radius <= 10.0 && radius > 0.0) {
                double area = myCircle.calculateArea();
                double perimeter = myCircle.calculatePerimeter();
                // Deliver output.
                System.out.printf("Area: %.2f, Perimeter: %.2f", area, perimeter);
            } else {
                System.out.println("Invalid radius. Please enter a radius between 0.0 and 10.0.");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Invalid input. Please use a valid entry.");
        }
    }
}
