package com.company.kwonhyunwoo.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of strings, return another array containing all of its longest strings.
 * <p>
 * Example
 * <p>
 * For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
 * allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.string inputArray
 * <p>
 * A non-empty array.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ inputArray.length ≤ 10,
 * 1 ≤ inputArray[i].length ≤ 10.
 * <p>
 * [output] array.string
 * <p>
 * Array of the longest strings, stored in the same order as in the inputArray.
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
