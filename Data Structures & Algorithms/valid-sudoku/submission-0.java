class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Parse
        List<List<Character>> rows = new ArrayList<>();
        List<List<Character>> columns = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            List<Character> row = new ArrayList<>();
            List<Character> column = new ArrayList<>();

            for (int j = 0; j < board[i].length; j++) {
                row.add(board[i][j]);
                column.add(board[j][i]);
            }

            columns.add(column);
            rows.add(row);
        }

        boolean result = true;

        // Check row
        for (List<Character> list : rows) {
            result = isSetValidSudoku(list);
            if (!result) { return false; }
        }

        // Check column
        for (List<Character> list : columns) {
            result = isSetValidSudoku(list);
            if (!result) { return false; }
        }

        List<List<Character>> squares = parseSquares(board);

        // Check squares
        for (List<Character> list : squares) {
            result = isSetValidSudoku(list);
            if (!result) { return false; }
        }

        return true;
    }

    protected List<List<Character>> parseSquares(char[][] board) {
        List<List<Character>> squares = new ArrayList<>();

        for (int startRow = 0; startRow < board.length; startRow += 3) {
            for (int startColumn = 0; startColumn < board.length; startColumn += 3) {
                List<Character> square = new ArrayList<>();

                for (int i = startRow; i < startRow + 3; i++) {
                    for (int j = startColumn; j < startColumn + 3; j++) {
                        square.add(board[i][j]);
                    }
                }

                squares.add(square);
            }
        }
        
        return squares;
    }

    protected boolean isSetValidSudoku(List<Character> list) {
        Set<Character> seen = new HashSet<>();

        for (Character c : list) {
            if (seen.contains(c) && c != '.') {
                return false;
            } else {
                seen.add(c);
            }
        }

        return true;
    }
}
