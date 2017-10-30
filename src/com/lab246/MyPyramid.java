package com.lab246;

import java.util.Scanner;

public class MyPyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number from 1 to 9: ");
        int h = scn.nextInt();
        if(h < 1 | h > 9){
            System.out.println("Read the condition again!");
        } else {
            printPyramid(h);
        }
    }

    public static int printPyramid(int h) {
        int countrow = 1;
        for (int i = h; i > 0; i--) {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= countrow; j++)
            {
                System.out.print(j+" ");
            }

            for (int j = countrow-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            countrow++;
        }
        return h;
    }
}
