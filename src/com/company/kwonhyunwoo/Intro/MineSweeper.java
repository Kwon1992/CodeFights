package com.company.kwonhyunwoo.Intro;

/**
 * In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells.
 * Starting off with some arrangement of mines we want to create a Minesweeper game setup.

 Example

 For

 matrix = [[true, false, false],
 [false, true, false],
 [false, false, false]]
 the output should be

 minesweeper(matrix) = [[1, 2, 1],
 [2, 1, 1],
 [1, 1, 1]]

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.array.boolean matrix

 A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine, false otherwise.

 Guaranteed constraints:
 2 ≤ matrix.length ≤ 5,
 2 ≤ matrix[0].length ≤ 5.

 [output] array.array.integer

 Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines in the neighboring cells. Two cells are called neighboring if they share at least one corner.
 */
public class MineSweeper {
    public static void main(String[] args) {
        minesweeper(new boolean[][]{
                {true, false, false},
                {false, true, false},
                {false, false, false}
        });
    }

    static int[][] minesweeper(boolean[][] matrix) {
        int[][] numMatrix = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                checkMine(matrix, numMatrix, row, column);
            }
        }
        return numMatrix;
    }

    private static void checkMine(boolean[][] matrix, int[][] numMatrix, int row, int column) {
        if (!matrix[row][column]) return; // false라면 return

        for (int i = row - 1; i < row + 2; i++) {
            for (int j = column - 1; j < column + 2; j++) {
                if(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length) {
                    numMatrix[i][j]++;
                }
            }
        }

        numMatrix[row][column]--; // discount itself
    }

}
