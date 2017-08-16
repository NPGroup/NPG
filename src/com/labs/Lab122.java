
package com.labs;

import java.util.Scanner;

public class Lab122 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int a = sc.nextInt();
        System.out.print("Введите число 2: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Сумма чисел: " + sum);
    }
}