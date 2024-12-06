package TicTacToe.domain;

import java.util.Scanner;

public class DynamicBoard extends Board{

    private char[][] board;
    private int N,M;

    public DynamicBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the variable N for an N*N grid: ");
        N = scanner.nextInt();

        System.out.println("Enter the variable M for the M-tags in a row win-condition: ");
        M = scanner.nextInt();
        board = new char[N][N];
        resetBoard();
    }

    public int sizeofBoard(){
        return board.length;
    }

    @Override
    public void resetBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '\0';
            }
        }
    }

    public void drawBoard() {
        for (int i = 0; i < N; i++) {
            // Draw the row
            for (int j = 0; j < N; j++) {
                System.out.print(" " + (board[i][j] == '\0' ? " " : board[i][j]));
                if (j < N - 1) {
                    System.out.print(" |");
                }
            }
            System.out.println(); // Move to the next line after the row

            // Draw the separator line after each row except the last one
            if (i < N - 1) {
                for (int j = 0; j < N; j++) {
                    System.out.print("---");
                    if (j < N - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
        }
    }

    public boolean isCellEmpty(int x, int y) {
        return board[x][y] == '\0';
    }

    public void setCell(int x, int y, char piece) {
        board[x][y] = piece;
    }

    @Override
    public boolean checkWin(char piece) {
        // Check all rows for horizontal wins
        for (int i = 0; i < N; i++) {
            // Horizontal check
            if (checkLine(piece, i, 0, 0, 1)) { 
                return true;
            }
        }

        // Check all columns for vertical wins
        for (int j = 0; j < N; j++) {
             // Vertical check
            if (checkLine(piece, 0, j, 1, 0)) {
                return true;
            }
        }

        // Normal diagonal check wins
        for (int i = 0; i < N; i++) {
            if (checkLine(piece, 0, 0, 1, 1)) { 
                return true;
            }
        }

        // Anti diagonal check wins
        for (int j = 0; j < N; j++) {
            if (checkLine(piece, 0, N-1, 1, -1)) { 
                return true;
            }
        }

        return false; // No win found
    }

    /*
     * Params: Piece, Starting Row, Startin Column,Row Incrememnt and Column Incrememnt
     * Returns: If we met the win-condition
     */
    private boolean checkLine(char piece, int startRow, int startCol, int rowIncrement, int colIncrement) {
        int count = 0;

        for (int step = 0; step < N; step++) {
            int row = startRow + step * rowIncrement;
            int col = startCol + step * colIncrement;

            // Ensure we stay within bounds
            if (row >= N || col >= N) {
                break;
            }

            // Check if the current cell matches the piece
            if (board[row][col] == piece) {
                count++;
                if (count == M) { // Found M consecutive markers
                    return true;
                }
            } else {
                count = 0; // Reset count if sequence breaks
            }
        }

        return false; // No win in this line
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\0') {
                    return false;
                }
            }
        }
        return true;
    }
}
