package com.company.kwonhyunwoo.Intro;

public class StringRearrangement {
    public static void main(String[] args) {
        System.out.println(stringsRearrangement(new String[]{"ab", "bb", "aa"}));
    }

    static boolean stringsRearrangement(String[] inputArray) {
        // condition :: 문자열 째로 교환 가능.
        // 연속된 문자열 사이의 다른 문자(character)가 무조건 하나씩만 있어야함.
        // aa - ab - bb (O)
        // aba -bab - bbb (X) bab와 bbb는 a를 b로 바꾸면 되지만 aba와 bab는 3개 모든 문자를 바꾸어야하므로..
        // ASCII??
        //TODO
        return false;
    }

}
