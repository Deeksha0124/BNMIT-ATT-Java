package Day6.Backtracking.SudokuSolver;
class LeetCodeSudoku {

    public static boolean isPathSafe(int row, int col, char[][] board, int val) {
        for (int i = 0; i < 9; i++) {
            //check the row
            if (board[row][i] == val) {
                return false;
            }
            //check the col
            if (board[i][col] == val) {
                return false;
            }
            //check each 3x3 matrix
            int subGridRow = 3 * (row / 3) + i / 3;
            int subGridCol = 3 * (col / 3) + i % 3;
            if (board[subGridRow][subGridCol] == val) {
                return false;
            }
        }
        return true;
    }


    public static boolean solveSudoku(char[][] board) {
        int n = 9;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] == '.') {
                    for (char val = '1'; val <= '9'; val++) {
                        if (isPathSafe(row, col, board, val)) {
                            board[row][col] = val;
                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[row][col] = '.'; //backtracking
                            }
                        }
                    }
                    return false; //  no valid number found
                }
            }

        }
        return true; //board successfully filled
    }
}