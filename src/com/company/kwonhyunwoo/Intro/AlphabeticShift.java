package com.company.kwonhyunwoo.Intro;


/**
 * Given a string, replace each its character by the next one in the English alphabet (z would be replaced by a).

 Example

 For inputString = crazy, the output should be
 alphabeticShift(inputString) = dsbaz.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 Non-empty string consisting of lowercase English characters.

 Guaranteed constraints:
 1 ≤ inputString.length ≤ 1000.

 [output] string

 The result string after replacing all of its characters.
 */
public class AlphabeticShift {
    public static void main(String[] args) {
        //crazy -> dsbaz //
        System.out.println(alphabeticShift("crazy"));
    }

    static String alphabeticShift(String inputString) {
        //Using ASCII code
        char[] charArr = inputString.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (charArr[i] + 1 > 'z') ? 'a' : (char) (charArr[i] + 1);
        }

        return String.valueOf(charArr);
    }

    ;


}
