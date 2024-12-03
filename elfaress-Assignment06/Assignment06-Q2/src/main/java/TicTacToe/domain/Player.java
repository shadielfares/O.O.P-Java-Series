package TicTacToe.domain;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private char piece;
    private boolean isComputer;

    public Player(String name, char piece, boolean isComputer) {
        this.name = name;
        this.piece = piece;
        this.isComputer = isComputer;
    }

    public String getName() {
        return name;
    }

    public char getPiece() {
        return piece;
    }

    public boolean isComputer() {
        return isComputer;
    }

    //Helper function
    public int[] stringArrtoInt(String[] s){
        int[] result = new int[s.length];
        for (int i = s.length -1; i >= 0; i--){
            result[s.length - i -1] = Integer.parseInt(s[i]);
        }
        return result;
    }

    public int[] makeMove(Board board) {
        //Get size of board
            int N = board.sizeofBoard();
        if (isComputer) {
            Random random = new Random();
            int x, y;
            do {
                x = random.nextInt(N);
                y = random.nextInt(N);
            } while (!board.isCellEmpty(x, y));
            return new int[]{x, y};
        } else {
            try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(name + ", enter the x,y-coordinate pair between (0-"+ (N-1) +"):" );
            String xy = scanner.nextLine();
            String splitChar = "[,]";
            String[] position = xy.split(splitChar);
            //scanner.close();
            return stringArrtoInt(position);
            }
            catch (Exception e){
                return new int[]{-1,-1}; 
            }
        }
    }
}
