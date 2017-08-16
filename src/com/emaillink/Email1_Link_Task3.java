package com.emaillink;
import java.util.Scanner;

public class Email1_Link_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int m = (int)n;
        double temp = (n - (double)m) * 100;
        if(temp < 50) {
            System.out.println(m);
        } else {
            System.out.println(m+1);
        }
    }
}
