package com.company.kwonhyunwoo.Intro;

public class AbsoluteValuesSumMinimization {
    public static void main(String[] args) {
        System.out.println(absoluteValuesSumMinimization(new int[]{1, 1, 3, 4}));

    }

    static int absoluteValuesSumMinimization(int[] a) {
        return a[(a.length - 1) / 2];

    }
}
