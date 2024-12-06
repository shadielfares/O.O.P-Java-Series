package TicTacToe;

import TicTacToe.domain.DynamicPlayer;
import TicTacToe.domain.DynamicGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Game Mode:");
        System.out.println("1. Player vs Player");
        System.out.println("2. Player vs Computer");
        System.out.println("3. Computer vs Computer");

        int choice = scanner.nextInt();

        DynamicPlayer player1, player2;

        if (choice == 1) {
            player1 = new DynamicPlayer("Player 1", 'X', false);
            player2 = new DynamicPlayer("Player 2", 'O', false);
        } else if (choice == 2) {
            player1 = new DynamicPlayer("Player 1", 'X', false);
            player2 = new DynamicPlayer("Computer", 'O', true);
        } else {
            player1 = new DynamicPlayer("Computer 1", 'X', true);
            player2 = new DynamicPlayer("Computer 2", 'O', true);
        }

        DynamicGame game = new DynamicGame(player1, player2);
        game.play();
    }
}
