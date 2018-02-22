package com.company.kwonhyunwoo.Intro;

import java.util.Stack;

/**
 * You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.
 * <p>
 * Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.
 * <p>
 * Example
 * <p>
 * For string s = "a(bc)de", the output should be
 * reverseParentheses(s) = "acbde".
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] string s
 * <p>
 * A string consisting of English letters, punctuation marks, whitespace characters and brackets. It is guaranteed that parentheses form a regular bracket sequence.
 * <p>
 * Constraints:
 * 5 ≤ s.length ≤ 55.
 * <p>
 * [output] string
 */
public class ReverseParentheses {
    public static void main(String[] args) {
        System.out.println(reverseParentheses("a(b(cd)e)"));
    }

    static String reverseParentheses(String s) {
        // possible problem :: there are many parenthesis such as "a(bcd(ef(ghi)j)k)lmn" //
        // Consideration 1. Using Stack.

        String res = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')':
                case '}':
                case ']':
                    while (stack.peek() != '(' && stack.peek() != '{' && stack.peek() != '[') {
                        res += stack.pop(); // pop 하면서 거꾸로 삽입됨.
                    }
                    stack.pop(); // remove open parentheses
                    for (int j = 0; j < res.length(); j++) { // 거꾸로 된 string을 다시 stack에 넣음.
                        stack.push(res.charAt(j));
                    }
                    res = "";
                    break;
                default:
                    stack.push(s.charAt(i));
            }
        }
        res = "";

        while (!stack.empty()) {
            res += stack.pop();
        }
        return new StringBuilder(res).reverse().toString(); // stack에서 뽑으면 뒤집혀서 나오므로 다시 뒤집어서 반환!
    }

    /* 여기서는 괄호가 (, )만 있다고 가정함.
    String reverseParentheses(String s) {
        int st = s.lastIndexOf('(');                                             // 거꾸로 보면서 '('가 가장 먼저 나타나는 idx 찾음. (만약 존재하지 않는다면 -1 반환) ex> abc(def(ghijk)lmn)op 의 경우 st는 7이 됨
        while(st != -1) {                                                        // 만약 존재한다면..
            int ed = s.indexOf(')', st);                                         // 순서대로 보면서 ')'가 가장 먼저 나타나는 idx 찾음  ...                        ex> abc(def(ghijk)lmn)op 의 경우 ed는 13이 됨
            String t = s.substring(0, st);                                       // 현재 찾은 괄호에 시작부분 앞의 모든 string을 substring함.
            t += new StringBuffer(s.substring(st + 1, ed)).reverse().toString(); // 찾은 괄호 내에 속하는 string을 뒤집어서 concat함.
            t += s.substring(ed + 1);                                            // 닫은 괄호 뒤의 부분을 substring해서 concat함.
            s = t;                                                               // 기존의 String을 바꾼 string으로 대체함
            st = s.lastIndexOf('(');                                             // 괄호가 더 존재하는지 check함 (while문 탈출조건 갱신을 위해)
        }
        return s;                                                                // while문 탈출 시 뒤집기가 끝났으므로 return 함.
    }

     */
}
