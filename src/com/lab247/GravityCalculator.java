package com.lab247;

public class GravityCalculator {
    public static void main(String[] args) {
        GravityCalculator.calcDist(10);
    }

    private static final double GRAVITY = -9.81;
    private static double initialVelocity = 0.0;
    private static double position = 0.0;
    private static double x;

    public static double calcDist(double time) {
        x = (0.5 * (GRAVITY * (time * time)) + (initialVelocity * time) + (position));
        System.out.println(x);
        return x;
    }
}
