package com.company.kwonhyunwoo.Intro;

public class BoxBlur {
    public static void main(String[] args) {
        boxBlur(new int[][]{
                                {7,4,0,1},
                                {5,6,2,2},
                                {6,10,7,8},
                                {1,4,2,0}  });
    }

    static int[][] boxBlur(int[][] image) {
        int[][] blurBox = new int[image.length - 2][image[0].length - 2];

        for (int i = 0; i < blurBox.length; i++) {
            for (int j = 0; j < blurBox[i].length; j++) {
                blurBox[i][j] = getBlurVal(image, i + 1, j + 1);
            }
        }
        return blurBox;
    }

    private static int getBlurVal(int[][] image, int row, int column) {
        int sum = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                sum += image[i][j];
            }
        }
        return sum / 9;
    }

}
