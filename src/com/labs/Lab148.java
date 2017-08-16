package com.labs;

public class Lab148 {
    public static void main(String[] args) {
        int i = 10;
        long l = i;
        float f = i;
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
        System.out.println();
        double d = 10.14;
        l = (long)d;
        i = (int)l;
        System.out.println("Double value "+d);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);
    }
}
