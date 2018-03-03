package com.company.kwonhyunwoo.Intro;

public class DepositProfit {
    public static void main(String[] args) {
        System.out.println(depositProfit(1, 100, 64));

    }

    static int depositProfit(int deposit, int rate, int threshold) {
        int count = 0;
        double curVAL = deposit;
        while (curVAL < threshold) {
            curVAL *= ((double) rate / 100 + 1);
            count++;
        }
        return count;
    }

}
