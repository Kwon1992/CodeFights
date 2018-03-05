package com.company.kwonhyunwoo.Intro;

/**
 Given a string, output its longest prefix which contains only digits.

 Example

 For inputString="123aa1", the output should be
 longestDigitsPrefix(inputString) = "123".

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 Guaranteed constraints:
 3 ≤ inputString.length ≤ 35.

 [output] string
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestDigitsPrefix {
    public static void main(String[] args) {
        System.out.println(longestDigitsPrefix("  3) always check for whitespaces"));
        System.out.println(longestDigitsPrefix("123aa1"));
    }

    static String longestDigitsPrefix(String inputString) {
        Pattern pattern = Pattern.compile("([\\d]*)");
        Matcher matcher = pattern.matcher(inputString);
        matcher.find();
        return matcher.group(1);
    }

}
