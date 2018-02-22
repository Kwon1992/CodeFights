package com.company.kwonhyunwoo.Intro;

/**
 * After they became famous, the CodeBots all decided to move to a new building and live together.
 * The building is represented by a rectangular matrix of rooms.
 * Each cell in the matrix contains an integer that represents the price of the room.
 * Some rooms are free (their cost is 0), but that's probably because they are haunted, so all the bots are afraid of them.
 * That is why any room that is free or is located anywhere below a free room in the same column is not considered suitable for the bots to live in.
 * Help the bots calculate the total price of all the rooms that are suitable for them.

 Example

 For
 matrix = [[0, 1, 1, 2],
 [0, 5, 0, 0],
 [2, 0, 3, 3]]
 the output should be
 matrixElementsSum(matrix) = 9.

 Here's the rooms matrix with unsuitable rooms marked with 'x':

 [[x, 1, 1, 2],
 [x, 5, x, x],
 [x, x, x, x]]
 Thus, the answer is 1 + 5 + 1 + 2 = 9.

 For
 matrix = [[1, 1, 1, 0],
 [0, 5, 0, 1],
 [2, 1, 3, 10]]
 the output should be
 matrixElementsSum(matrix) = 9.

 Here's the rooms matrix with unsuitable rooms marked with 'x':

 [[1, 1, 1, x],
 [x, 5, x, x],
 [x, 1, x, x]]
 Note that the free room in the first row make the full column unsuitable for bots.

 Thus, the answer is 1 + 1 + 1 + 5 + 1 = 9.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.array.integer matrix

 A 2-dimensional array of integers representing a rectangular matrix of the building.

 Guaranteed constraints:
 1 ≤ matrix.length ≤ 5,
 1 ≤ matrix[i].length ≤ 5,
 0 ≤ matrix[i][j] ≤ 10.

 [output] integer

 The total price of all the rooms that are suitable for the CodeBots to live in.
 */

public class MatrixElementsSum {

    public static void main(String[] args) {
        System.out.println(matrixElementsSum(new int[][]{{0, 1, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}}));
    }

    static int matrixElementsSum(int[][] matrix) {
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0 && row < matrix.length - 1) {
                    matrix[row + 1][col] = 0;
                }
                sum += matrix[row][col]; // 어짜피 cost가 0이면 더해도 차이가 없으므로 딱히 0과 0이 아닌 것을 구분하지 않고 다 더한다.
            }
        }
        return sum;
    }

}
