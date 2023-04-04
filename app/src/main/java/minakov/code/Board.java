package minakov.code;

public class Board {
    public static void createBoard() {
        int[][] board = new int[10][10];

    for(int i = 0; i < 4; i++) {
        int firstNum = 0;
        int lastNum = 10;
        int firstIndexShip = firstNum + (int) (Math.random() * lastNum);
        int secondIndexShip = firstNum + (int) (Math.random() * lastNum);
        board[firstIndexShip][secondIndexShip] = 1;
    }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }
}



