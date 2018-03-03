package com.company.kwonhyunwoo.Intro;

/**
 Find the leftmost digit that occurs in a given string.

 Example

 For inputString = "var_1__Int", the output should be
 firstDigit(inputString) = '1';
 For inputString = "q2q-q", the output should be
 firstDigit(inputString) = '2';
 For inputString = "0ss", the output should be
 firstDigit(inputString) = '0'.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 A string containing at least one digit.

 Guaranteed constraints:
 3 ≤ inputString.length ≤ 10.

 [output] char
 */
public class FirstDigit {
    public static void main(String[] args) {
        System.out.println(firstDigit("var_1__Int"));
        System.out.println(firstDigit("q2q-q"));
        System.out.println(firstDigit("0ss"));
    }

    static char firstDigit(String inputString) {
        final char NO_NUM = '0';

        for (int i = 0; i < inputString.length(); i++) {
            char curChar = inputString.charAt(i);
            if ('0' <= curChar && curChar <= '9')
                return curChar;
        }

        return NO_NUM;
    }

    // inputString.replaceAll("[^0-9]", "").charAt(0);

}
