package com.company.kwonhyunwoo.Intro;

public class GrowingPlant {
    public static void main(String[] args) {
        System.out.println(growingPlant(100, 10, 910));
    }

    static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int plantHeight = 0;
        int dayCount = 1;

        while (plantHeight <= desiredHeight) {
            plantHeight += upSpeed;
            if (plantHeight >= desiredHeight) break;
            plantHeight -= downSpeed;
            dayCount++;
        }
        return dayCount;

        // The height after x days (up - down) * (x - 1) + up
        // We want dh <= (u - d) * (x - 1) + u
        // (dh - u) / (u - d) + 1 <= x
//        return Math.max(0, (int) Math.ceil((double) (desiredHeight - upSpeed) / (upSpeed - downSpeed))) + 1;
    }

}
