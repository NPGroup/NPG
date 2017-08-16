package com.emaillink;

public class Email1_Link_Task2 {
    public static void main(String[] args) {
        int n = 44;
        int temp = n % 10;
        int sum = temp + ((n-temp) / 10);
        System.out.println(sum);
    }
}
