package com.lab245;

import java.util.Scanner;

public class MyCalc {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MyCalc pi = new MyCalc();
        System.out.print("Input integer 'n' number: ");
        pi.calcPi(scn.nextInt());
    }

    public static double calcPi(int n) {
        if (n < 0) {
            n = n * -1;
        }
        int constNum = 4;
        int divider = 3;
        double result = 4;
        for (int i = 4; i <= n; i++) {
            if (i % 2 == 0) {
                result = result - ((double) constNum / (double) divider);
            } else {
                result = result + ((double) constNum / (double) divider);
            }
            divider += 2;
        }
        System.out.println("Value of computing pi approximately close to the real PI -> " + result);
        return result;
    }

}
