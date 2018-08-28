package solutions;

public class Ttt {
    public static void main(String[] args) {
        char[][] board = { { 'X', 'X', 'X' }, { 'O', 'O', 'O' },
                { 'X', 'X', 'X' } };

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
