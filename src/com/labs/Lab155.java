package com.labs;
import java.util.Scanner;

public class Lab155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i < (n + 1);i++) {
            sum += i;
        }
        double avg = (double)(sum) / (double)(n);
        System.out.println("The Sum is: " + sum);
        System.out.println("The Average is: " + avg);
    }
}
