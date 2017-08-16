package com.labs;

/**
 * Created by User on 08/08/2017.
 */
public class Lab151 {
    public static void main(String[] args) {
        for(int i = 1;i < 10;i++) {
            for(int j = 8;j > 0;j--){
                if (j < i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
