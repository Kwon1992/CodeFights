package com.company.kwonhyunwoo.Intro;

/**
 * You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

 Example

 For inputArray = [1, 1, 1], the output should be
 arrayChange(inputArray) = 3.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Guaranteed constraints:
 3 ≤ inputArray.length ≤ 105,
 -105 ≤ inputArray[i] ≤ 105.

 [output] integer

 The minimal number of moves needed to obtain a strictly increasing sequence from inputArray.
 It's guaranteed that for the given test cases the answer always fits signed 32-bit integer type.

 Here is an explanation for test [-1000, 0, -2, 0]: it can be easily transformed using 5 operations as follows:
 [-1000, 0, -2, 0] -> [-1000, 0, -1, 0] -> [-1000, 0, 0, 0] -> [-1000, 0, 1, 0] -> [-1000, 0, 1, 1] -> [-1000, 0, 1, 2]
 Hope it'll help"
 */
public class ArrayChange {
    public static void main(String[] args) {
        System.out.println(arrayChange(new int[]{1, 1, 1}));
    }

    static int arrayChange(int[] inputArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] >= inputArray[i + 1]) {
                count += (inputArray[i] - inputArray[i + 1] + 1);
                inputArray[i + 1] = inputArray[i] + 1;
            }
        }
        return count;
    }

//    방법 2_ while 돌면서 1씩 더해가기
//
//    static int arrayChange(int[] inputArray) {
//        int count = 0;
//        for(int i = 0; i <inputArray.length-1 ; i++) {
//            while(inputArray[i] >= inputArray[i+1]) {
//                inputArray[i+1]++;
//                count++;
//            }
//        }
//        return count;
//    }
}
