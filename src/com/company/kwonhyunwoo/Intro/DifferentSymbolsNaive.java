package com.company.kwonhyunwoo.Intro;

import java.util.HashSet;
import java.util.Set;

/**
 Given a string, find the number of different characters in it.

 Example

 For s = cabca;, the output should be
 differentSymbolsNaive(s) = 3.

 There are 3 different characters a, b and c.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string s

 A string of lowercase English letters.

 Guaranteed constraints:
 3 ≤ s.length ≤ 1000.

 [output] integer
 */
public class DifferentSymbolsNaive {
    public static void main(String[] args) {
        System.out.println(differentSymbolsNaive("cabca"));
    }

    static int differentSymbolsNaive(String s) {
        Set<Character> intSet = new HashSet<>(); // set은 중복이 되지 않는다.

        for (int i = 0; i < s.length(); i++) {
            intSet.add(s.charAt(i));
        }
        return intSet.size();
    }

}
