package com.company.kwonhyunwoo.Intro;

/**
 * Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.

 Check if the given string is a correct variable name.

 Example

 For name = &quot;var_1__Int&quot;, the output should be
 variableName(name) = true;
 For name = &quot;qq-q&quot;, the output should be
 variableName(name) = false;
 For name = &quot;2w2&quot;, the output should be
 variableName(name) = false.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string name

 Guaranteed constraints:
 1 ≤ name.length ≤ 10.

 [output] boolean

 true if name is a correct variable name, false otherwise.
 */
public class VariableName {
    public static void main(String[] args) {
        System.out.println(variableName("var_1__Int"));
        System.out.println(variableName("qq-q"));
        System.out.println(variableName("2w2"));
        System.out.println(variableName(" variable"));
        System.out.println(variableName("<VAR"));

    }

    static boolean variableName(String name) {
        return name.matches("[\\D&&\\w|_][\\d_\\w]*"); // 첫 문자는 숫자가 아니면서 알파벳 혹은 _ 이어야함.  그뒤로는 숫자/ _ / 알파벳이 이어지거나 없어도 됨(변수의 최소길이는 1글자면 되니까)
    }


}
