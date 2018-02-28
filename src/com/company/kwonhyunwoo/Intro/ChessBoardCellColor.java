package com.company.kwonhyunwoo.Intro;

/**
 Given two cells on the standard chess board, determine whether they have the same color or not.

 Example

 For cell1 = "A1" and cell2 = "C3", the output should be
 chessBoardCellColor(cell1, cell2) = true.

 Input/Output

 [execution time limit] 3 seconds (jav  a)

 [input] string cell1

 [input] string cell2

 [output] boolean

 true if both cells have the same color, false otherwise.
 */

// 체스판은 알파벳과 숫자의 조합으로 좌표가 이루어진다.
public class ChessBoardCellColor {
    public static void main(String[] args) {
        System.out.println(chessBoardCellColor("A1", "C3")); // true
        System.out.println(chessBoardCellColor("A1", "H3")); // false

    }

    static boolean chessBoardCellColor(String cell1, String cell2) {
        int cell1_pos = 0, cell2_pos = 0;
        for (char c : cell1.toCharArray()) {
            cell1_pos += c;
        }

        for (char c : cell2.toCharArray()) {
            cell2_pos += c;
        }

        return ((cell1_pos - '0') % 2 == (cell2_pos - '0') % 2);
    }

}
