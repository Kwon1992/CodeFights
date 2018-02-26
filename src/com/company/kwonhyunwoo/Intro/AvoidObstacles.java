package com.company.kwonhyunwoo.Intro;

import java.util.Arrays;

/**
 * You are given an array of integers representing coordinates of obstacles situated on a straight line.

 Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

 Find the minimal length of the jump enough to avoid all the obstacles.

 Example

 For inputArray = [5, 3, 6, 7, 9], the output should be
 avoidObstacles(inputArray) = 4.

 Check out the image below for better understanding:

0 :: obstacle  | :: non-obstacle

 |-----|-----|-----0-----|-----0-----0-----0-----|-----0-----|-----|------|
 0     1     2     3     4     5     6     7     8     9     10    11     12
 |                       |                       |
 └---------------------┘└--------------------┘└---------------------┘

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Non-empty array of positive integers.

 Guaranteed constraints:
 2 ≤ inputArray.length ≤ 10,
 1 ≤ inputArray[i] ≤ 40.

 [output] integer

 The desired length.
 */

public class AvoidObstacles {
    public static void main(String[] args) {
        System.out.println(avoidObstacles(new int[]{1, 4, 10, 6, 2}));
    }

    static int avoidObstacles(int[] inputArray) {
        // 최대 sequential number의 길이 + 1만큼은 건너뛰어야 한다.. 즉 3,4,5 에 장애물이 있을 경우 최소 4칸은 동시에 넘어가야 한다.
        Arrays.sort(inputArray);

        int jumpLen = 1; // minimum jumping length is 1.

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] + 1 == inputArray[i + 1]) {
                jumpLen++;
                continue;
            } // find max sequential length

            jumpLen++; // add 1 for jump length
            break; // no more sequential... (we can guarantee this because array is sorted by increasing order.)
        }

        int curPos = 0;

        while(curPos < inputArray[inputArray.length-1]) { // max Val Obstacle...
            curPos += jumpLen;
            for (int i : inputArray) {
                if(curPos == i) {
                    curPos = 0;
                    jumpLen++;
                }
            }
        }

//        Solving Problem by using % operation.
//
//        int jump = 1;
//        boolean fail = true;
//
//        while (fail) {
//            jump++;
//            fail = false;
//            for (int i = 0; i < inputArray.length; i++)
//                if (inputArray[i] % jump == 0) {
//                    fail = true;
//                    break;
//                }
//        }
//
//        return jump;


        return jumpLen;
    }

}
