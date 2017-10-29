package com.lab220;


public class Matrix {

    public void addition(int a, int b, int c, int d) {

        int[][] mxa = new int[10][10];
        int[][] res1 = new int[10][10];
        for (int i = 0; i < mxa.length; i++) {
            for (int j = 0; j < mxa.length; j++) {
                res1[i][j] = mxa[i][j] + mxa[j][i];
            }
        }
        System.out.println(res1);
    }

    public void multiplication(int a, int b, int c, int d) {
        int[][] mxm = new int[10][10];
        int[][] res2 = new int[10][10];
        for (int i = 0; i < mxm.length; i++) {
            for (int j = 0; j < mxm.length; j++) {
                res2[i][j] = mxm[i][j] * mxm[j][i];

            }
        }
        System.out.println(res2);
    }
}
