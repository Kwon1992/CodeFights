package com.company.kwonhyunwoo.Intro;

/**
 * Check if all digits of the given integer are even.

 Example

 For n = 248622, the output should be
 evenDigitsOnly(n) = true;
 For n = 642386, the output should be
 evenDigitsOnly(n) = false.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 Guaranteed constraints:
 1 ≤ n ≤ 109.

 [output] boolean

 true if all digits of n are even, false otherwise.
 */
public class EvenDigitsOnly {
    public static void main(String[] args) {
        System.out.println(evenDigitsOnly(642386));
        System.out.println(evenDigitsOnly(248622));
    }

    static boolean evenDigitsOnly(int n) {
        while ((n % 10) % 2 == 0 && n != 0) {
            n /= 10;
        }
        return n == 0;

//        // Using Regex
//        return Integer.toString(n).matches("(0|2|4|6|8)*");
    }


}
