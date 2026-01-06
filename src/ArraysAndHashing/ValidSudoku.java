package ArraysAndHashing;

import java.util.HashSet;
//https://leetcode.com/problems/valid-sudoku/description/
//36. Valid Sudoku
//https://youtu.be/j1Cs6rF6wYs?si=PzD2Av-gWn_zJGNJ
public class ValidSudoku {
    static void main() {
        String[][] board =
                {{"5", "3", ".", ".", "7", ".", ".", ".", "."}
                        , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
                        , {".", "9", "8", ".", ".", ".", ".", "6", "."}
                        , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                        , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                        , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                        , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                        , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                        , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};

        char[][] boardChar = new char[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boardChar[i][j] = board[i][j].charAt(0);
            }
        }

        System.out.println(isValidSudoku(boardChar));
    }

    public static boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] col = new HashSet[n];
        HashSet<Character>[] box = new HashSet[n];

        for(int i=0;i<n;i++){
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            box[i] = new HashSet<Character>();
        }

        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                char cell = board[r][c];
                if(cell == '.') continue;

                if(row[r].contains(cell)){
                    return false;
                }
                row[r].add(cell);

                if(col[c].contains(cell)) {
                    return false;
                }
                col[c].add(cell);

                int boxIdx = 3 * (r/3)  + (c/3);
                if(box[boxIdx].contains(cell)) {
                    return false;
                }
                box[boxIdx].add(cell);
            }
        }

        return true;
    }
}
