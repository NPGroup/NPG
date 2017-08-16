package com.emaillink;

public class Email1_Link_Task4 {
    public static void main(String[] args) {
        int x = 123;
        int x1 = x % 10;
        int x2 = ((x - x1) / 10) % 10;
        int x3 = (((x - x1) / 10) - x2) / 10;
        System.out.println("Sum of number of 3 digits: " + (x1 + x2 + x3));
    }
}
