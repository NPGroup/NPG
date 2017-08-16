package com.labs;
import java.util.Scanner;

public class Lab156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int abs = (n < 0) ? -n : n;
        int sum = 0;
        if (abs < 10 & abs != 0) {
            System.out.println("Sum of squares of digits: " + (sum = abs * abs));
        } else while (abs > 9) {
            if(abs > 9) {
                int temp = abs;
                temp %= 10;
                sum += (temp * temp);
                abs = (abs - temp) / 10;
                if(abs < 10) {
                    sum += abs;
                }
            } else break;
        }
        System.out.println("Sum of squares of digits: " + sum);
    }
}