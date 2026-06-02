class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows and columns
        for (int i = 0; i < 9; i++) {

            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                // Row check
                if (board[i][j] != '.') {
                    if (row.contains(board[i][j])) {
                        return false;
                    }
                    row.add(board[i][j]);
                }

                // Column check
                if (board[j][i] != '.') {
                    if (col.contains(board[j][i])) {
                        return false;
                    }
                    col.add(board[j][i]);
                }
            }
        }

        // Check 3x3 sub-boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                Set<Character> box = new HashSet<>();

                for (int i = boxRow; i < boxRow + 3; i++) {
                    for (int j = boxCol; j < boxCol + 3; j++) {

                        if (board[i][j] != '.') {
                            if (box.contains(board[i][j])) {
                                return false;
                            }
                            box.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}