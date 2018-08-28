package solutions;

public class TttCheck {
    public static void main(String[] args) {
        char[][] board = { { '*', '*', '*' }, { '*', '*', '*' },
                { '*', '*', '*' } };
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        printBoard(board);

        System.out.print("Enter 'X' or 'O'");
        String player = scanner.next();

        System.out.print("Enter the row (1-3)");
        int row = scanner.nextInt();
        if (row < 1 || row > 3) {
            System.err.println("row is out of range");
            System.exit(1);
        }

        System.out.print("enter the column (1-3)");
        int col = scanner.nextInt();
        if (col < 1 || col > 3) {
            System.err.println("column is out of range");
            System.exit(1);
        }
        scanner.close();

        board[row - 1][col - 1] = player.toUpperCase().charAt(0);

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
