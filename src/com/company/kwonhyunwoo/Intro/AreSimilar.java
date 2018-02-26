package com.company.kwonhyunwoo.Intro;

/**
 * Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

 Given two arrays a and b, check whether they are similar.

 Example

 For a = [1, 2, 3] and b = [1, 2, 3], the output should be
 areSimilar(a, b) = true.

 The arrays are equal, no need to swap any elements.

 For a = [1, 2, 3] and b = [2, 1, 3], the output should be
 areSimilar(a, b) = true.

 We can obtain b from a by swapping 2 and 1 in b.

 For a = [1, 2, 2] and b = [2, 1, 1], the output should be
 areSimilar(a, b) = false.

 Any swap of any two elements either in a or in b won't make a and b equal.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer a

 Array of integers.

 Guaranteed constraints:
 3 ≤ a.length ≤ 105,
 1 ≤ a[i] ≤ 1000.

 [input] array.integer b

 Array of integers of the same length as a.

 Guaranteed constraints:
 b.length = a.length,
 1 ≤ b[i] ≤ 1000.

 [output] boolean

 true if a and b are similar, false otherwise.
 */
public class AreSimilar {
    public static void main(String[] args) {
        System.out.println(areSimilar(new int[]{2, 1, 2, 1, 1, 1, 2}, new int[]{1, 1, 2, 1, 2, 1, 2}));

    }

    static boolean areSimilar(int[] a, int[] b) {
        boolean unmatch = false, isChanged= false;
        int a_unmatch = 0, b_umnatch = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                if(!unmatch) { // 처음으로 unmatch하는 경우 flag를 true로 바꾼 뒤, 각각의 값을 저장한다.
                    unmatch = true;
                    a_unmatch = a[i];
                    b_umnatch = b[i];
                } else if((a[i] == b_umnatch && b[i] == a_unmatch) && !isChanged) {
                    // 그 뒤 불일치하는 경우가 발생할 때 값의 위치를 서로 바꾸었을 때 일치하는지 확인 한다.
                    // 만약 일치하다면 바꾸어주었음을 체크하기 위해 isChanged flag를 바꿔준다.
                    isChanged = true;
                } else {
                    // 그 뒤에도 불일치하는 경우가 나타난다면 Similar 상태가 아니므로 false를 return한다.
                    return false;
                }
            }
        }
        return true;

    }
}
