package com.company.kwonhyunwoo.Intro;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 Given array of integers, remove each kth element from it.

 Example

 For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
 extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Guaranteed constraints:
 5 ≤ inputArray.length ≤ 15,
 -20 ≤ inputArray[i] ≤ 20.

 [input] integer k

 Guaranteed constraints:
 1 ≤ k ≤ 10.

 [output] array.integer

 inputArray without elements k - 1, 2k - 1, 3k - 1 etc.
 */
public class ExtractEachKth {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractEachKth(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3)));
    }

    static int[] extractEachKth(int[] inputArray, int k) {
        List<Integer> integerList = new LinkedList<>();

        for (int i = 0; i < inputArray.length; i++) {
            if ((i+1) % k  == 0) continue;
            integerList.add(inputArray[i]);
        }

        int[] extractedResult = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            extractedResult[i] = integerList.get(i);
        }

        return  extractedResult;


    }

}
