package com.labs;

/**
 * Created by User on 08/08/2017.
 */
public class Lab161 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        /*for(int i = 0;i < 15;i++) {
            mas[i] = 2 + i*2;
            System.out.println(mas[i]);
        }*/
        for(int i = 2;i <= 30;i =i +2) {
            mas[i/2-1] = i;
            System.out.println(mas[i/2-1]);
        }

    }
}
