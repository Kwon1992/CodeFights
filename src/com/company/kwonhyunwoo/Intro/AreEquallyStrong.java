package com.company.kwonhyunwoo.Intro;

public class AreEquallyStrong {
    public static void main(String[] args) {
        System.out.println(areEquallyStrong(10, 15, 5, 20));
    }

    static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return (yourLeft == friendsLeft && yourRight == friendsRight) || (yourLeft == friendsRight && yourRight == friendsLeft);
        // 왼 - 왼 같고 오 - 오 같다 // 왼 - 오 같고 오 - 왼 같다.
    }

}
