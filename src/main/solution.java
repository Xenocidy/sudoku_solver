package src.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class solution {

    /**
     * Takes in an unsolved sudoku board and return a solved board
     * 
     * @param board Uncompleted sudoku board
     * @return board Completed sudoku board
     */
    public String[][] solveSudoku(String[][] board) {
        // public static String[][] solveSudoku() {
        // String[][] board = {
        // { ".", "1", "3", "7", ".", "4", "5", "8", "9" },
        // { ".", "5", "4", ".", "9", ".", ".", ".", "." },
        // { ".", "8", "2", "1", "5", "6", ".", "7", "3" },
        // { ".", "7", ".", ".", "6", ".", ".", ".", "." },
        // { "1", "9", ".", ".", ".", ".", ".", "4", "7" },
        // { "3", ".", ".", ".", ".", "1", "2", "5", "." },
        // { ".", ".", ".", "6", "3", ".", "7", "9", "." },
        // { "5", ".", ".", ".", ".", ".", ".", ".", "2" },
        // { ".", "3", ".", "2", ".", "7", ".", ".", "." } };

        Set<String> box1 = new HashSet<String>();
        box1.add("1");
        box1.add("2");
        box1.add("3");
        box1.add("4");
        box1.add("5");
        box1.add("6");
        box1.add("7");
        box1.add("8");
        box1.add("9");
        Set<String> box2 = new HashSet<String>(box1);
        Set<String> box3 = new HashSet<String>(box1);
        Set<String> box4 = new HashSet<String>(box1);
        Set<String> box5 = new HashSet<String>(box1);
        Set<String> box6 = new HashSet<String>(box1);
        Set<String> box7 = new HashSet<String>(box1);
        Set<String> box8 = new HashSet<String>(box1);
        Set<String> box9 = new HashSet<String>(box1);

        Set<String> row0 = new HashSet<String>(box1);
        Set<String> row1 = new HashSet<String>(box1);
        Set<String> row2 = new HashSet<String>(box1);
        Set<String> row3 = new HashSet<String>(box1);
        Set<String> row4 = new HashSet<String>(box1);
        Set<String> row5 = new HashSet<String>(box1);
        Set<String> row6 = new HashSet<String>(box1);
        Set<String> row7 = new HashSet<String>(box1);
        Set<String> row8 = new HashSet<String>(box1);
        ArrayList<Set<String>> rows = new ArrayList<Set<String>>();
        rows.add(row0);
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);
        rows.add(row6);
        rows.add(row7);
        rows.add(row8);

        Set<String> col0 = new HashSet<String>(box1);
        Set<String> col1 = new HashSet<String>(box1);
        Set<String> col2 = new HashSet<String>(box1);
        Set<String> col3 = new HashSet<String>(box1);
        Set<String> col4 = new HashSet<String>(box1);
        Set<String> col5 = new HashSet<String>(box1);
        Set<String> col6 = new HashSet<String>(box1);
        Set<String> col7 = new HashSet<String>(box1);
        Set<String> col8 = new HashSet<String>(box1);
        ArrayList<Set<String>> cols = new ArrayList<Set<String>>();
        cols.add(col0);
        cols.add(col1);
        cols.add(col2);
        cols.add(col3);
        cols.add(col4);
        cols.add(col5);
        cols.add(col6);
        cols.add(col7);
        cols.add(col8);

        // verify if board is valid

        // record all available values within each structure
        // queues are used to record open positions
        ArrayList<String> rQueue = new ArrayList<>();
        ArrayList<String> cQueue = new ArrayList<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                // record each subbox
                if (row <= 2 && col <= 2) {
                    if (box1.contains(board[row][col]))
                        box1.remove(board[row][col]);

                } else if (row <= 2 && 3 <= col && col <= 5) {
                    if (box2.contains(board[row][col]))
                        box2.remove(board[row][col]);

                } else if (row <= 2 && 6 <= col && col <= 8) {
                    if (box3.contains(board[row][col]))
                        box3.remove(board[row][col]);

                } else if (3 <= row && row <= 5 && col <= 2) {
                    if (box4.contains(board[row][col]))
                        box4.remove(board[row][col]);

                } else if (3 <= row && row <= 5 && 3 <= col && col <= 5) {
                    if (box5.contains(board[row][col]))
                        box5.remove(board[row][col]);

                } else if (3 <= row && row <= 5 && 6 <= col && col <= 8) {
                    if (box6.contains(board[row][col]))
                        box6.remove(board[row][col]);

                } else if (6 <= row && row <= 8 && col <= 2) {
                    if (box7.contains(board[row][col]))
                        box7.remove(board[row][col]);

                } else if (6 <= row && row <= 8 && 3 <= col && col <= 5) {
                    if (box8.contains(board[row][col]))
                        box8.remove(board[row][col]);

                } else if (6 <= row && row <= 8 && 6 <= col && col <= 8) {
                    if (box9.contains(board[row][col]))
                        box9.remove(board[row][col]);

                }

                // record each row
                switch (row) {
                    case 0:
                        if (row0.contains(board[row][col]))
                            row0.remove(board[row][col]);
                        break;
                    case 1:
                        if (row1.contains(board[row][col]))
                            row1.remove(board[row][col]);
                        break;
                    case 2:
                        if (row2.contains(board[row][col]))
                            row2.remove(board[row][col]);
                        break;
                    case 3:
                        if (row3.contains(board[row][col]))
                            row3.remove(board[row][col]);
                        break;
                    case 4:
                        if (row4.contains(board[row][col]))
                            row4.remove(board[row][col]);
                        break;
                    case 5:
                        if (row5.contains(board[row][col]))
                            row5.remove(board[row][col]);
                        break;
                    case 6:
                        if (row6.contains(board[row][col]))
                            row6.remove(board[row][col]);
                        break;
                    case 7:
                        if (row7.contains(board[row][col]))
                            row7.remove(board[row][col]);
                        break;
                    case 8:
                        if (row8.contains(board[row][col]))
                            row8.remove(board[row][col]);
                        break;
                }

                // record each column
                switch (col) {
                    case 0:
                        if (col0.contains(board[row][col]))
                            col0.remove(board[row][col]);
                        break;
                    case 1:
                        if (col1.contains(board[row][col]))
                            col1.remove(board[row][col]);
                        break;
                    case 2:
                        if (col2.contains(board[row][col]))
                            col2.remove(board[row][col]);
                        break;
                    case 3:
                        if (col3.contains(board[row][col]))
                            col3.remove(board[row][col]);
                        break;
                    case 4:
                        if (col4.contains(board[row][col]))
                            col4.remove(board[row][col]);
                        break;
                    case 5:
                        if (col5.contains(board[row][col]))
                            col5.remove(board[row][col]);
                        break;
                    case 6:
                        if (col6.contains(board[row][col]))
                            col6.remove(board[row][col]);
                        break;
                    case 7:
                        if (col7.contains(board[row][col]))
                            col7.remove(board[row][col]);
                        break;
                    case 8:
                        if (col8.contains(board[row][col]))
                            col8.remove(board[row][col]);
                        break;
                }

                // record the positions that are empty
                if (!isNumeric(board[row][col])) {
                    rQueue.add(Integer.toString(row));
                    cQueue.add(Integer.toString(col));
                }

            }
        }

        // iterate until board is complete
        while (!rQueue.isEmpty() || !cQueue.isEmpty()) {

            ArrayList<String> available = new ArrayList<>();
            int row = Integer.valueOf(rQueue.remove(0));
            int col = Integer.valueOf(cQueue.remove(0));

            // determine the subbox it is in
            if (row <= 2 && col <= 2) {

                // record all overlapping values between each subbox, column, and row
                for (String value : box1) {
                    if (rows.get(row).contains(value) && cols.get(col).contains(value))
                        available.add(value);
                }

                // if only one available answer possible, record it and remove it as available
                // within each structure
                if (available.size() == 1) {
                    board[row][col] = available.get(0);
                    box1.remove(available.get(0));
                    rows.get(row).remove(available.get(0));
                    cols.get(col).remove(available.get(0));
                    continue;
                }

            } else if (row <= 2 && 3 <= col && col <= 5) {

                // record all overlapping values between each subbox, column, and row
                for (String value : box2) {
                    if (rows.get(row).contains(value) && cols.get(col).contains(value))
                        available.add(value);
                }

                // if only one available answer possible, record it and remove it as available
                // within each structure
                if (available.size() == 1) {
                    board[row][col] = available.get(0);
                    box2.remove(available.get(0));
                    rows.get(row).remove(available.get(0));
                    cols.get(col).remove(available.get(0));
                    continue;
                }

            } else if (row <= 2 && 6 <= col && col <= 8) {

                // record all overlapping values between each subbox, column, and row
                for (String value : box3) {
                    if (rows.get(row).contains(value) && cols.get(col).contains(value))
                        available.add(value);
                }

                // if only one available answer possible, record it and remove it as available
                // within each structure
                if (available.size() == 1) {
                    board[row][col] = available.get(0);
                    box3.remove(available.get(0));
                    rows.get(row).remove(available.get(0));
                    cols.get(col).remove(available.get(0));
                    continue;
                }

            } else if (3 <= row && row <= 5 && col <= 2) {

                // record all overlapping values between each subbox, column, and row
                for (String value : box4) {
                    if (rows.get(row).contains(value) && cols.get(col).contains(value))
                        available.add(value);
                }

                // if only one available answer possible, record it and remove it as available
                // within each structure
                if (available.size() == 1) {
                    board[row][col] = available.get(0);
                    box4.remove(available.get(0));
                    rows.get(row).remove(available.get(0));
                    cols.get(col).remove(available.get(0));
                    continue;
                }

            } else if (3 <= row && row <= 5 && 3 <= col && col <= 5) {

                // record all overlapping values between each subbox, column, and row
                for (String value : box5) {
                    if (rows.get(row).contains(value) && cols.get(col).contains(value))
                        available.add(value);
                }

                // if only one available answer possible, record it and remove it as available
                // within each structure
                if (available.size() == 1) {
                    board[row][col] = available.get(0);
                    box5.remove(available.get(0));
                    rows.get(row).remove(available.get(0));
                    cols.get(col).remove(available.get(0));
                    continue;
                }

            } else if (3 <= row && row <= 5 && 6 <= col && col <= 8) {

                // record all overlapping values between each subbox, column, and row
                for (String value : box6) {
                    if (rows.get(row).contains(value) && cols.get(col).contains(value))
                        available.add(value);
                }

                // if only one available answer possible, record it and remove it as available
                // within each structure
                if (available.size() == 1) {
                    board[row][col] = available.get(0);
                    box6.remove(available.get(0));
                    rows.get(row).remove(available.get(0));
                    cols.get(col).remove(available.get(0));
                    continue;
                }

            } else if (6 <= row && row <= 8 && col <= 2) {

                // record all overlapping values between each subbox, column, and row
                for (String value : box7) {
                    if (rows.get(row).contains(value) && cols.get(col).contains(value))
                        available.add(value);
                }

                // if only one available answer possible, record it and remove it as available
                // within each structure
                if (available.size() == 1) {
                    board[row][col] = available.get(0);
                    box7.remove(available.get(0));
                    rows.get(row).remove(available.get(0));
                    cols.get(col).remove(available.get(0));
                    continue;
                }

            } else if (6 <= row && row <= 8 && 3 <= col && col <= 5) {

                // record all overlapping values between each subbox, column, and row
                for (String value : box8) {
                    if (rows.get(row).contains(value) && cols.get(col).contains(value))
                        available.add(value);
                }

                // if only one available answer possible, record it and remove it as available
                // within each structure
                if (available.size() == 1) {
                    board[row][col] = available.get(0);
                    box8.remove(available.get(0));
                    rows.get(row).remove(available.get(0));
                    cols.get(col).remove(available.get(0));
                    continue;
                }

            } else if (6 <= row && row <= 8 && 6 <= col && col <= 8) {

                // record all overlapping values between each subbox, column, and row
                for (String value : box9) {
                    if (rows.get(row).contains(value) && cols.get(col).contains(value))
                        available.add(value);
                }

                // if only one available answer possible, record it and remove it as available
                // within each structure
                if (available.size() == 1) {
                    board[row][col] = available.get(0);
                    box9.remove(available.get(0));
                    rows.get(row).remove(available.get(0));
                    cols.get(col).remove(available.get(0));
                    continue;
                }

            }

            // re-queue the position if cannot be solved right now
            rQueue.add(String.valueOf(row));
            cQueue.add(String.valueOf(col));

        }

        // System.out.println(box1);
        // System.out.println(box2);
        // System.out.println(box3);
        // System.out.println(box4);
        // System.out.println(box5);
        // System.out.println(box6);
        // System.out.println(box7);
        // System.out.println(box8);
        // System.out.println(box9);
        // System.out.println("---");
        // System.out.println(row0);
        // System.out.println(row1);
        // System.out.println(row2);
        // System.out.println(row3);
        // System.out.println(row4);
        // System.out.println(row5);
        // System.out.println(row6);
        // System.out.println(row7);
        // System.out.println(row8);
        // System.out.println("---");
        // System.out.println(col0);
        // System.out.println(col1);
        // System.out.println(col2);
        // System.out.println(col3);
        // System.out.println(col4);
        // System.out.println(col5);
        // System.out.println(col6);
        // System.out.println(col7);
        // System.out.println(col8);

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }

        return board;

    }

    /**
     * Check to see if a board value is a valid sudoku value
     * 
     * @param str String of board value
     * @return boolean if str is a 0-9 value
     */
    private static boolean isNumeric(String str) {
        if (str.length() > 1)
            return false;

        return str.matches("[0-9]");
    }

    public static void main(String[] args) {
        // solveSudoku();
    }
}