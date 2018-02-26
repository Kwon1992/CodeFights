package com.company.kwonhyunwoo.Intro;

public class ArrayMaximalAdjacentDifference {
    public static void main(String[] args) {
        System.out.println(arrayMaximalAdjacentDifference(new int[]{2, 4, 1, 0}));
    }

    static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maxDifference = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int absDiffer = Math.abs(inputArray[i] - inputArray[i + 1]);
            maxDifference = absDiffer > maxDifference ? absDiffer : maxDifference;
        }
        return maxDifference;
    }

}
