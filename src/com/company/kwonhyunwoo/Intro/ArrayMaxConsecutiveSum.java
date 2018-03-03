package com.company.kwonhyunwoo.Intro;

/**
 Given array of integers, find the maximal possible sum of some of its k consecutive elements.

 Example

 For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
 arrayMaxConsecutiveSum(inputArray, k) = 8.
 All possible sums of 2 consecutive elements are:

 2 + 3 = 5;
 3 + 5 = 8;
 5 + 1 = 6;
 1 + 6 = 7.
 Thus, the answer is 8.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Array of positive integers.

 Guaranteed constraints:
 3 ≤ inputArray.length ≤ 105,
 1 ≤ inputArray[i] ≤ 1000.

 [input] integer k

 An integer (not greater than the length of inputArray).

 Guaranteed constraints:
 1 ≤ k ≤ inputArray.length.

 [output] integer

 The maximal possible sum.
 */
public class ArrayMaxConsecutiveSum {
    public static void main(String[] args) {
        System.out.println(arrayMaxConsecutiveSum(new int[]{2, 3, 5, 1, 6}, 2));
    }

    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0, startPos = 0, endPos = k;

        for (int idx = startPos; idx < endPos; idx++) {
            curSum += inputArray[idx];
        }

        maxSum = curSum; // 처음 연속된 숫자의 합을 넣어서 maxSum 초기화

        while (endPos < inputArray.length) {
            curSum -= inputArray[startPos++];
            curSum += inputArray[endPos++];
            maxSum = maxSum < curSum ? curSum : maxSum;
        }
        return maxSum;
    }

}
