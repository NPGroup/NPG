package com.lab225;

import static java.lang.Math.PI;

public class A {

    private double square;

    public void calcSquare(final int aRad,final int bSize) {
        square = aRad * bSize;
        System.out.println("Square of Rectangle: " + (int)square);
    }


    public void calcSquare(final int aRad) {
        square = aRad * aRad;
        System.out.println("Square of Foursquare: " + (int)square);

    }


    public void calcSquare(final double aRad) {
        square = (aRad * aRad) * PI;
        System.out.println("Square of Circle: " + square);
    }
}
