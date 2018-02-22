package com.company.kwonhyunwoo.Intro;

/**
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

 Example

 For sequence = [1, 3, 2, 1], the output should be
 almostIncreasingSequence(sequence) = false;

 There is no one element in this array that can be removed in order to get a strictly increasing sequence.

 For sequence = [1, 3, 2], the output should be
 almostIncreasingSequence(sequence) = true.

 You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer sequence

 Guaranteed constraints:
 2 ≤ sequence.length ≤ 105,
 -105 ≤ sequence[i] ≤ 105.

 [output] boolean

 Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.
 */

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        System.out.println(almostIncreasingSequence(new int[]{1,10, 7 , 11}));
    }

    static boolean almostIncreasingSequence(int[] sequence) {
        int idx = 0;
        boolean falseFlag = false;
        for (; idx < sequence.length - 1; idx++) {
            if (sequence[idx] >= sequence[idx + 1]) {
                if (!falseFlag) { //만약 increasing order가 처음으로 아니게 될 경우 둘 중(sequence[idx] 혹은 sequence[idx+1]) 한 원소를 삭제했을 때에는 문제가 되지 않으므로 falseFlag를 true로 만든 뒤 넘긴다.
                    falseFlag = true;
                } else { // 하지만, 이미 falseFlag가 true인 상태(즉, 한 번이라도 불일치하는 요소를 제거한 경우)에서 또 다시 increasing order가 되지 않는 경우에는 false를 반환한다.
                    return false;
                }

                if (idx > 0 && idx < (sequence.length - 2)) {
                    // 해당 요소를 지운 뒤에도 체크해야하는 부분이 있다. 즉, 해당 요소를 지운 뒤에 앞 뒤를 체크해서 제대로 increasing order인지 확인해야한다.
                    // 즉, [1, 2, 1, 2] 의 상황에서 1번째 2를 지울 것인지, 2번째 1을 지울 것인지 결정해야한다.
                    // 두 개의 상황을 모두 가정하여 하나라도 increasing order가 해당되는 경우 continue를 한다.
                    // 위의 경우에는 어느 부분을 지워도 increasing order가 되지 않으므로 (즉, 한 개의 요소를 지우는 것만으로는 increasing order를 만들 수 없으므로 false return.
                    // [1, 2, 3, 4, 3, 6] 의 경우에는 idx가 3일 때 4가 3보다 크므로 문제가 발생하게 된다.
                    // 이 때 4를 지울 것인지 뒤의 3을 지울 것인지 결정해야하는데, 4를 지우는 경우에 sequence[idx-1] 과 sequence[idx+1]를 비교해야하며 이 때 increasing order가 되지 않는다.
                    // 한편, 뒤의 3을 지우는 경우 sequence[idx]와 sequence[idx+2]를 비교하며 icreasing order가 되므로 뒤의 요소를 지운 것으로 계속해서 판단하고 진행한다.

                    // 중요! 뒤의 요소를 지운 것으로 처리했을 때 고려해볼 수 있는 문제는 현재 algorithm이 for문을 돌면서 순회하기 때문에 지웠다고 가정한 요소에 대한 값 비교가 진행된다는 것이다.
                    // 즉, [1, 2, 3, 4, 3, 6]에서 idx 4에 해당하는 3을 지웠다고 가정해도,  다음 for loop에서 해당 3과 다음 6을 비교한다는 점이다.
                    // 하지만, 이는 문제가 되지 않는데 만약 위의 상황의 경우 이미 idx 4(3)를 지웠을 때 idx 3에 해당하는 4가 6보다 작다는 것을 확인하였기 때문에 idx 4의 다음 위치에 있는 값이 idx 4보다 크다는 것을 보장할 수 있다.

                    if (sequence[idx - 1] >= sequence[idx + 1] == false || sequence[idx] >= sequence[idx + 2] == false) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
