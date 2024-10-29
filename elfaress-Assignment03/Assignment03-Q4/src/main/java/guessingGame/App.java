package guessingGame;

import java.util.Scanner;
import java.util.Random;

public class App {

    // Retrieve Guess
    public static int retrieveInput(Scanner scanner) {
        int guess = 0;
        while (true) {
            try {
                System.out.println("Guess what the number is: ");
                guess = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid integer.");
                scanner.next();  // Clear invalid input
            }
        }
        return guess;
    }

    // Game logic
    public static String guessingGame(int guess, int target) {
        if (guess > target) {
            return String.format("The number is lower than %d.", guess);
        } else if (guess < target) {
            return String.format("The number is higher than %d.", guess);
        } else {
            return "You successfully guessed the number!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int max = 100, min = -100;
        int target = rand.nextInt(max - min + 1) + min;
        int guessCount = 0;
        boolean gameWon = false;

        // Start the game loop
        while (guessCount < 10 && !gameWon) {
            int input = retrieveInput(scanner);

            if (input > max || input < min) {
                System.out.println("Please enter a number within the range of -100 and 100.");
                continue;
            }

            String result = guessingGame(input, target);
            System.out.println(result);

            guessCount++;

            if (result.equals("You successfully guessed the number!")) {
                gameWon = true;
            }
        }

        if (!gameWon) {
            System.out.println("You have exhausted your trials. The number was: " + target);
        } else {
            System.out.println("You guessed it in " + guessCount + " tries!");
        }

        scanner.close();
    }
}

