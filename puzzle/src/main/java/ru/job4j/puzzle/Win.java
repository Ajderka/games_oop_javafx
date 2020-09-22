package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
           if(horizontal(board, i) || vertical(board, i)) {
               rsl = true;
               break;
           }
        }
        return rsl;
    }

    private static boolean horizontal(int[][] massive, int row) {
        boolean result = true;
            for (int j = 0; j < massive[row].length; j++) {
                if(massive[row][j] != 1) {
                    result = false;
                    break;
                }
            }
        return result;
    }

    private static boolean vertical(int[][] massive, int column) {
        boolean result = true;
            for (int j = 0; j < massive.length; j++) {
                if (massive[j][column] != 1) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
