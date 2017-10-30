package com.lab240;

import java.util.Arrays;


public class MyMath {

    public static int findMin(int[] value) {
        int min = 100;
        for (int i = 0; i < value.length; i++) {
            if (value[i] < min) {
                min = value[i];
            }
        }
        System.out.println("minValue " + min);
        return min;
    }

    public static int findMax(int[] value) {
        int max = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }
        System.out.println("maxValue " + max);
        return max;
    }

    public final static double PI=3.14;

    static double areaOfCircle(int radius){
        double area = radius * radius * PI;
        System.out.println("Area of Circle: " + area);
        return area;
    }

    public static void main(String[] args) {
        int[] value = {144, 256, 7, 14, -44, -235};
        findMin(value);
        findMax(value);
        System.out.println();
        findMin(Calculation.nvalues1);
        findMin(Calculation.nvalues2);
        System.out.println();
        findMax(Calculation.nvalues1);
        findMax(Calculation.nvalues2);
        System.out.println();
        Arrays.sort(value);
        System.out.println("Sorted Array: " + Arrays.toString(value));
        int min = value[0];
        System.out.println("Min value :" + min);
        int max = value[5];
        System.out.println("Max value: " + max);
        System.out.println();
        areaOfCircle(4);
    }
}
