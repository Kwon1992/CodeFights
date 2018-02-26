package com.company.kwonhyunwoo.Intro;

/**
 * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

 Example

 For inputArray = [2, 4, 1, 0], the output should be
 arrayMaximalAdjacentDifference(inputArray) = 3.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Guaranteed constraints:
 3 ≤ inputArray.length ≤ 10,
 -15 ≤ inputArray[i] ≤ 15.

 [output] integer

 The maximal absolute difference.
 */
public class ArrayMaximalAdjacentDifference {
    public static void main(String[] args) {
        System.out.println(arrayMaximalAdjacentDifference(new int[]{2, 4, 1, 0}));
    }

    static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maxDifference = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int absDiffer = Math.abs(inputArray[i] - inputArray[i + 1]);
            maxDifference = absDiffer > maxDifference ? absDiffer : maxDifference;
        }
        return maxDifference;
    }

}
