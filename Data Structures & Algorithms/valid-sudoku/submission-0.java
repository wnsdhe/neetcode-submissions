class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rows = new HashMap();
        HashMap<Integer, HashSet<Character>> cols = new HashMap();
        HashMap<String, HashSet<Character>> squares = new HashMap(); // int divide index/3 (index) 
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    String squareIndex = "" + row/3 + col/3;
                    rows.putIfAbsent(row, new HashSet<>());
                    cols.putIfAbsent(col, new HashSet<>());
                    squares.putIfAbsent(squareIndex, new HashSet<>());
                    if (rows.get(row).contains(board[row][col])) {
                        return false;
                    } else {
                        rows.get(row).add(board[row][col]);
                    }
                    if (cols.get(col).contains(board[row][col])) {
                        return false;
                    } else {
                        cols.get(col).add(board[row][col]);
                    }
                    if (squares.get(squareIndex).contains(board[row][col])) {
                        return false;
                    } else {
                        squares.get(squareIndex).add(board[row][col]);
                    }
                }
            }
        }
        return true;

    }
}
