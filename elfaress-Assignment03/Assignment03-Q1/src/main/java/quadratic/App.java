package quadratic;

import java.util.Scanner;

/**
 * Input: Ints a, b, c
 * Output: String if no real roots, imaginary roots 
 */
public class App {

    // A method to calculate the Quadratic Formula.
    public double[] Quadratic(int a, int b, int c) {
        double[] roots = new double[2];
        if (Math.pow(b, 2) - 4 * a * c < 0) {
            // Imaginary Roots
            roots[0] = roots[1] = 0;
        } else if (Math.pow(b, 2) - 4 * a * c == 0) {
            // Single Root
            roots[0] = -b / (2 * a);
        } else {
            roots[0] = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            roots[1] = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        }
        return roots;
    }

    // A method to guarantee correct retrieval of input from user
    public int[] retrieveInput() {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        System.out.println("This script will prompt you to enter values for the Quadratic Equation.");
        // Use a while loop to keep prompting until valid values are entered for a, b, c.
        while (true) {
            try {
                System.out.println("Enter a value for a: ");
                a = scanner.nextInt();
                if (a < -100 || a > 100) {
                    System.out.println("Invalid input! Please enter a value within the bounds [-100, 100].");
                    continue;
                }

                System.out.println("Enter a value for b: ");
                b = scanner.nextInt();
                if (b < -100 || b > 100) {
                    System.out.println("Invalid input! Please enter a value within the bounds [-100, 100].");
                    continue;
                }

                System.out.println("Enter a value for c: ");
                c = scanner.nextInt();
                if (c < -100 || c > 100) {
                    System.out.println("Invalid input! Please enter a value within the bounds [-100, 100].");
                    continue;
                }
                break; // Exit the loop if all inputs are valid
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
        return new int[]{a, b, c};
    }

    // A method to output a string corresponding to the correct case.
    public String displayOutput(double[] roots, int a, int b, int c) {
        String result;

        if (roots[0] == 0 && roots[1] == 0) {
            result = "The equation has no real roots.";
        } else if (roots[0] != 0 && roots[1] == 0) {
            result = String.format("For a=%d, b=%d, and c=%d, the single root is %.2f.", a, b, c, roots[0]);
        } else {
            result = String.format("For a=%d, b=%d, and c=%d, the roots are %.2f and %.2f.", a, b, c, roots[0], roots[1]);
        }
        return result;
    }

    // The main should simply be for running the functions and presenting the final product.
    public static void main(String[] args) {
        App app = new App();
        double[] outputs = new double[2];
        int[] inputs = new int[3];

        try {
            inputs = app.retrieveInput(); // Get valid inputs
            outputs = app.Quadratic(inputs[0], inputs[1], inputs[2]); // Calculate roots
            System.out.println(app.displayOutput(outputs, inputs[0], inputs[1], inputs[2])); // Display output
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

