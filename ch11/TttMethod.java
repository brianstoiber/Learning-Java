package solutions;

public class TttMethod {
    public static void main(String[] args) {
        char[][] board = { { 'X', 'X', 'X' }, { 'O', 'O', 'O' },
                { 'X', 'X', 'X' } };
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
