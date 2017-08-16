package com.labs;

public class Lab154 {
    public static void main(String[] args) {
        for(int i = 1;i <= 300;++i) {
            if (i % 3 == 0 | i % 4 == 0) {
                if(i < 21) {
                    System.out.println(i);
                } else {
                    break;
                }
            }
        }
    }

}
