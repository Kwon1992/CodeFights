package com.company.kwonhyunwoo.Intro;

/**
 * An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication.
 * There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

 IPv4 addresses are represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255 inclusive, separated by dots, e.g., 172.16.254.1.

 Given a string, find out if it satisfies the IPv4 address naming rules.

 Example

 For inputString = "172.16.254.1", the output should be
 isIPv4Address(inputString) = true;

 For inputString = "172.316.254.1", the output should be
 isIPv4Address(inputString) = false.

 316 is not in range [0, 255].

 For inputString = ".254.255.0", the output should be
 isIPv4Address(inputString) = false.

 There is no first number.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 Guaranteed constraints:
 1 ≤ inputString.length ≤ 30.

 [output] boolean

 true if inputString satisfies the IPv4 address naming rules, false otherwise.
 */
public class IsIPv4Address {
    public static void main(String[] args) {
        System.out.println(isIPv4Address("1.1.1.1a"));
        System.out.println(isIPv4Address(".254.255.0"));
        System.out.println(isIPv4Address("15.254.255.0"));
        System.out.println(isIPv4Address("597.254.255.0"));

    }

    static boolean isIPv4Address(String inputString) {
        String[] decimals = inputString.split("\\."); // .을 기준으로 split함 (\\.인 이유는 그냥 .만 쓰면 모든 문자를 의미 따라서 마침표를 기준으로 나누도록 \\. 를 씀) 참고 : http://bronks.tistory.com/428

        if (decimals.length != 4) return false; // 4개의 element가 나오지 않으면 IP주소가 아님.

        for (String decimal : decimals) {
            // issue :: . 을 기준으로 나눈 각각의 element들이 꼭 숫자로만 이루어져있다고 장담할 수 없다. 예) ".254.255.0" , "1.1.1.1a" 등...
            int intVal = 0;
            try {
                intVal = Integer.parseInt(decimal);
            } catch (NumberFormatException e) { // parseInt가 불가능한 경우... 해당 element가 숫자로만 이루어지지 않았다는 의미. 따라서, IPv4의 주소가 아니므로 false return.
                return false;
            }
            if (intVal < 0 || intVal > 255) return false; // 만약 숫자로 이루어져있어도 ip 범위를 넘어가는 숫자에 대해서는 false return
        }
        return true;
    }

}
