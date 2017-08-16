package com.labs;
import java.util.Scanner;

public class Lab152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // Example (a) - "nested-if" statement
        if(x == 1) {
            System.out.println("One");
        } else if(x == 2) {
            System.out.println("Two");
        } else if(x == 3) {
            System.out.println("Three");
        } else if(x == 4) {
            System.out.println("Four");
        } else if(x == 5) {
            System.out.println("Five");
        } else if(x == 6) {
            System.out.println("Six");
        } else if(x == 7) {
            System.out.println("Seven");
        } else if(x == 8) {
            System.out.println("Eight");
        } else if(x == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }
        // Example (b) - "switch-case" statement
        x = sc.nextInt();
        String number;
        switch (x) {
            case 1:  number = "One";
                break;
            case 2:  number = "Two";
                break;
            case 3:  number = "Three";
                break;
            case 4:  number = "Four";
                break;
            case 5:  number = "Five";
                break;
            case 6:  number = "Six";
                break;
            case 7:  number = "Seven";
                break;
            case 8:  number = "Eight";
                break;
            case 9:  number = "Nine";
                break;
            default: number = "Other";
                break;
        }
        System.out.println(number);

    }
}
