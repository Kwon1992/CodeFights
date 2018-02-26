package com.company.kwonhyunwoo.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of strings, return another array containing all of its longest strings.

 Example

 For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
 allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.string inputArray

 A non-empty array.

 Guaranteed constraints:
 1 ≤ inputArray.length ≤ 10,
 1 ≤ inputArray[i].length ≤ 10.

 [output] array.string

 Array of the longest strings, stored in the same order as in the inputArray.
 */
public class AllLongestStrings {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(allLongestStrings(new String[]{
                "a",
                "abc",
                "cbd",
                "zzzzzz",
                "a",
                "abcdef",
                "asasa",
                "aaaaaa"})));
    }


    static String[] allLongestStrings(String[] inputArray) {
        int maxLen = 0;
        List<String> strings = new ArrayList<>();

        for (String s : inputArray) {
            if (maxLen < s.length()) {
                maxLen = s.length();
                strings.clear();
                strings.add(s);
            } else if (maxLen == s.length()) {
                strings.add(s);
            }
        }
        return strings.toArray(new String[strings.size()]);
    }


}
