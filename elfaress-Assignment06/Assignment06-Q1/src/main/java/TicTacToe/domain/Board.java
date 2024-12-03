package TicTacToe.domain;

public class Board {

    private char[][] board;

    public Board() {
        board = new char[3][3];
        resetBoard();
    }

    public void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '\0';
            }
        }
    }

    public void drawBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + (board[i][j] == '\0' ? " " : board[i][j]));
                if (j < 2) System.out.print(" |");
            }
            System.out.println();
            if (i < 2) System.out.println("---|---|---");
        }
    }

    public boolean isCellEmpty(int x, int y) {
        return board[x][y] == '\0';
    }

    public void setCell(int x, int y, char piece) {
        board[x][y] = piece;
    }

    public boolean checkWin(char piece) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == piece && board[i][1] == piece && board[i][2] == piece) ||
                (board[0][i] == piece && board[1][i] == piece && board[2][i] == piece)) {
                return true;
            }
        }

        // Check diagonals
        return (board[0][0] == piece && board[1][1] == piece && board[2][2] == piece) ||
               (board[0][2] == piece && board[1][1] == piece && board[2][0] == piece);
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
