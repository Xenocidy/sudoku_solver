import java.util.HashSet;
import java.util.Set;

class Solution {
    //public void solveSudoku(char[][] board) {
    public static void solveSudoku() {
        String[][] board = {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        Set<String> box1 = new HashSet<String>();
        Set<String> box2 = new HashSet<String>();
        Set<String> box3 = new HashSet<String>();
        Set<String> box4 = new HashSet<String>();
        Set<String> box5 = new HashSet<String>();
        Set<String> box6 = new HashSet<String>();
        Set<String> box7 = new HashSet<String>();
        Set<String> box8 = new HashSet<String>();
        Set<String> box9 = new HashSet<String>();
        
        Set<String> row0 = new HashSet<String>();
        Set<String> row1 = new HashSet<String>();
        Set<String> row2 = new HashSet<String>();
        Set<String> row3 = new HashSet<String>();
        Set<String> row4 = new HashSet<String>();
        Set<String> row5 = new HashSet<String>();
        Set<String> row6 = new HashSet<String>();
        Set<String> row7 = new HashSet<String>();
        Set<String> row8 = new HashSet<String>();
        
        Set<String> col0 = new HashSet<String>();
        Set<String> col1 = new HashSet<String>();
        Set<String> col2 = new HashSet<String>();
        Set<String> col3 = new HashSet<String>();
        Set<String> col4 = new HashSet<String>();
        Set<String> col5 = new HashSet<String>();
        Set<String> col6 = new HashSet<String>();
        Set<String> col7 = new HashSet<String>();
        Set<String> col8 = new HashSet<String>();

        // verify if board is valid
        
        // record all initial values
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                // record each subbox
                if (row <= 2 && col <= 2) {
                    box1.add(board[row][col]);

                } else if (row <= 2 && 3 <= col && col <= 5) {
                    box2.add(board[row][col]);

                } else if (row <= 2 && 6 <= col && col <= 8) {
                    box3.add(board[row][col]);
                    
                } else if (3 <= row && row <= 5 && col <= 2) {
                    box4.add(board[row][col]);
                    
                } else if (3 <= row && row <= 5 && 3 <= col && col <= 5) {
                    box5.add(board[row][col]);
                    
                } else if (3 <= row && row <= 5 && 6 <= col && col <= 8) {
                    box6.add(board[row][col]);
                    
                } else if (6 <= row && row <= 8 && col <= 2) {
                    box7.add(board[row][col]);
                    
                } else if (6 <= row && row <= 8 && 3 <= col && col <= 5) {
                    box8.add(board[row][col]);
                    
                } else if (6 <= row && row <= 8 && 6 <= col && col <= 8) {
                    box9.add(board[row][col]);
                    
                }


                // record each row
                switch (row) {
                    case 0: row0.add(board[row][col]);
                    break;
                    case 1: row1.add(board[row][col]);
                    break;
                    case 2: row2.add(board[row][col]);
                    break;
                    case 3: row3.add(board[row][col]);
                    break;
                    case 4: row4.add(board[row][col]);
                    break;
                    case 5: row5.add(board[row][col]);
                    break;
                    case 6: row6.add(board[row][col]);
                    break;
                    case 7: row7.add(board[row][col]);
                    break;
                    case 8: row8.add(board[row][col]);
                    break;
                }

                // record each column
                switch (col) {
                    case 0: col0.add(board[row][col]);
                    break;
                    case 1: col1.add(board[row][col]);
                    break;
                    case 2: col2.add(board[row][col]);
                    break;
                    case 3: col3.add(board[row][col]);
                    break;
                    case 4: col4.add(board[row][col]);
                    break;
                    case 5: col5.add(board[row][col]);
                    break;
                    case 6: col6.add(board[row][col]);
                    break;
                    case 7: col7.add(board[row][col]);
                    break;
                    case 8: col8.add(board[row][col]);
                    break;
                }

            }
        }

        

    }

    public static void main(String[] args) {
        solveSudoku();
    }
}