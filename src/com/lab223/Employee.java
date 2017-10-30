package com.lab223;

public class Employee {
    public void calcSalary(String name, double... salary) {
        double sumSalary = 0;
        for(double i : salary){
            sumSalary += i;
        }
        System.out.println("Accountant -> " + name + " : Total salary -> " + (int)sumSalary + "$");
    }
}
