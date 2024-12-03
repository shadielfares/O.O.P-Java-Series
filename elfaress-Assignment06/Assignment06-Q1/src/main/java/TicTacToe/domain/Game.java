package TicTacToe.domain;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.board = new Board();
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Player currentPlayer = player1;
        boolean playing = true;
        while (playing) {
            board.drawBoard();
            System.out.println(currentPlayer.getName() + "'s turn. Piece: " + currentPlayer.getPiece());

            int[] move = currentPlayer.makeMove(board);

            if (move[0] == -1 || move [1] ==  -1){
                System.out.println("Please fix your input and try again.");
                break;
            }
            int x = move[0];
            int y = move[1];

            if (board.isCellEmpty(x, y)) {
                board.setCell(x, y, currentPlayer.getPiece());
                if (board.checkWin(currentPlayer.getPiece())) {
                    board.drawBoard();
                    System.out.println(currentPlayer.getName() + " wins!");
                    playing = restart();
                } else if (board.isFull()) {
                    board.drawBoard();
                    System.out.println("It's a draw!");
                    playing = restart();
                }
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    public boolean restart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play again: (y) Yes OR (n) No");
        String response = scanner.next();
        scanner.close();
        while (true){
            if (response.equals("y")){
                board.resetBoard();
                return true;
            } else if (response.equals("n")){
                System.out.println("Thank you for playing!");
                return false;
            } else {
                System.out.println("Invalid Entry");
                return false;
            }
        }
    }
}
