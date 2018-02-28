package com.company.kwonhyunwoo.Intro;

/**
 Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).

 Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.

 Example

 For n = 10 and firstNumber = 2, the output should be
 circleOfNumbers(n, firstNumber) = 7.



 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 A positive even integer.

 Guaranteed constraints:
 4 ≤ n ≤ 20.

 [input] integer firstNumber

 Guaranteed constraints:
 0 ≤ firstNumber ≤ n - 1.

 [output] integer
 */

public class CircleOfNumbers {
    public static void main(String[] args) {
        System.out.println(circleOfNumbers(10, 2));
    }

    static int circleOfNumbers(int n, int firstNumber) {
        return (n / 2 + firstNumber) % n;
        // 마주 보는 것을 찾기 위해선 길이의 절반만큼 이동한다는 뜻이다. 따라서 전체 길이를 의미하는 n을 2로 나눈 뒤 시작지점에서 더한다.
        // 이 때, 기존의 길이를 초과하는 결과가 나올 수 있는데, Circular하고 있기 때문에 전체길이로 modular하면 된다.
    }

}
