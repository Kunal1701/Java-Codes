package Backtracking;

class nQueens {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        NQueen(board, 0);

    }

    private static void NQueen(char[][] board, int i) {
        if (i == board.length) {
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, i, j)) {
                board[i][j] = 'Q';
                NQueen(board, i + 1);
                board[i][j] = 'x';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println("*********Board**********");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
