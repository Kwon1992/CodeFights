package com.company.kwonhyunwoo.Intro;

/**
 Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

 Given a ticket number n, determine if it's lucky or not.

 Example

 For n = 1230, the output should be
 isLucky(n) = true;
 For n = 239017, the output should be
 isLucky(n) = false.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 A ticket number represented as a positive integer with an even number of digits.

 Guaranteed constraints:
 10 ≤ n < 106.

 [output] boolean

 true if n is a lucky ticket number, false otherwise.
 */

public class IsLucky {
    public static void main(String[] args) {
        System.out.println(isLucky(1230));
    }

    //1230
    static boolean isLucky(int n) {
        // make n to String to check num of digits.
        // Using ASCII code

        int sumLeftHalf = 0, sumRightHalf = 0;

        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            if (i < number.length() / 2) {
                sumLeftHalf += number.charAt(i)+48;
            } else {
                sumRightHalf += number.charAt(i)+48;
            }
        }
        return sumLeftHalf == sumRightHalf;
    }

    /*
    boolean isLucky(int n) {

    String s = n+"";
    int sum = 0;

    for(int i=0; i<s.length()/2; i++)
        sum+=(s.charAt(i)-s.charAt(s.length()-1-i));

    return sum==0;
    }
    반만 더하고 나머지 반은 빼서 합이 0이면 같은 것!! (이런 식으로도 생각 가능)
     */
}
