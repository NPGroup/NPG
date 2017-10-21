package com.Lab210;

// Lab 2-1-3

public class Main {
    public static void main(String[] args) {

        String view = "";
        Computer compArr[] = new Computer[5];
        for( int i = 0;i < compArr.length;i++) {
            compArr[i] = new Computer();
            compArr[i].setPrice(100F);
            compArr[i].setPrice(compArr[i].getPrice() * (float)1.1);
            compArr[i].view(view);
        }
    }
}