package com.company.kwonhyunwoo.Intro;

public class ArrayChange {
    public static void main(String[] args) {
        System.out.println(arrayChange(new int[]{1, 1, 1}));
    }

    static int arrayChange(int[] inputArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] >= inputArray[i + 1]) {
                count += (inputArray[i] - inputArray[i + 1] + 1);
                inputArray[i + 1] = inputArray[i] + 1;
            }
        }
        return count;
    }

//    방법 2_ while 돌면서 1씩 더해가기
//
//    static int arrayChange(int[] inputArray) {
//        int count = 0;
//        for(int i = 0; i <inputArray.length-1 ; i++) {
//            while(inputArray[i] >= inputArray[i+1]) {
//                inputArray[i+1]++;
//                count++;
//            }
//        }
//        return count;
//    }
}
