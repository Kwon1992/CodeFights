package com.company.kwonhyunwoo.Intro;

import java.util.Arrays;

/**
 Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.

 Example

 For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
 sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer a

 If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.

 Guaranteed constraints:
 5 ≤ a.length ≤ 15,
 -1 ≤ a[i] ≤ 200.

 [output] array.integer

 Sorted array a with all the trees untouched.
 */
public class SortByHeight {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByHeight(new int[]{-1, 150, 190, 170, -1, -1, 160, 180})));

    }

    static int[] sortByHeight(int[] a) {
        // -1 cannot be moved..
        // using sorting algorithm? selection sort
        int min, minIdx;
        for (int i = 0; i < a.length; i++) {
            minIdx = i;
            min = a[i];
            if (a[i] == -1) continue;
            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j] && a[j] != -1) {
                    minIdx = j;
                    min = a[j];
                }
            }
            int temp = a[i];
            a[i] = min;
            a[minIdx] = temp;
        }
        return a;
    }

}
