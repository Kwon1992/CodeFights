package com.company.kwonhyunwoo;

import java.util.Arrays;

/**
 Given two strings, find the number of common characters between them.

 Example

 For s1 = "aabcc" and s2 = "adcaa", the output should be
 commonCharacterCount(s1, s2) = 3.

 Strings have 3 common characters - 2 "a"s and 1 "c".

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string s1

 A string consisting of lowercase latin letters a-z.

 Guaranteed constraints:
 1 ≤ s1.length ≤ 15.

 [input] string s2

 A string consisting of lowercase latin letters a-z.

 Guaranteed constraints:
 1 ≤ s2.length ≤ 15.

 [output] integer
 */
public class CommonCharacterCount {

    public static void main(String[] args) {
        System.out.println(commonCharacterCount("aabcc", "adcaa"));
    }

    static int commonCharacterCount(String s1, String s2) {
        // Using ASCII code?  a:97 ~ z:122 ~~> can a:0 ~ z:25
        // easy way :: 각 array별로 문자마다 counting해서 비교한다.
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 97]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 97]++;
        }

        for (int i = 0; i < s1Count.length; i++) {
            // 어짜피 하나라도 0이면 3항 연산자에 의해 0을 더하게 되므로 둘 다 0인지 아닌지 구분할 필요 없음.
            result += (s1Count[i] < s2Count[i])? s1Count[i]: s2Count[i];
        }
        return result;
    }
}
