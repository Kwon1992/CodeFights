package com.company.kwonhyunwoo.Intro;

/**
 Given a rectangular matrix of characters, add a border of asterisks(*) to it.

 Example

 For

 picture = {abc,
 ded}
 the output should be

 addBorder(picture) = {*****,
                       *abc*,
                       *ded*,
                       *****}
 */
public class AddBorder {
    public static void main(String[] args) {
        for (String s : addBorder(new String[]{"abc",
                                               "ded"})) {
            System.out.println(s);
        }
    }

    static String[] addBorder(String[] picture) {
        String[] borderedPicture = new String[picture.length+2];
        // String 하나의 길이를 출력..
        String border = "";
        for (int i = 0; i < (picture[0].length() + 2); i++) {
            border += "*";
        }
        borderedPicture[0] = border;

        for (int i = 0; i < picture.length; i++) {
            borderedPicture[i+1] = "*" + picture[i] + "*";
        }
        borderedPicture[borderedPicture.length-1] = border;
        return borderedPicture;
    }
}
