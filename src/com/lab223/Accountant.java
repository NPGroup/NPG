package com.lab223;

public class Accountant {
    public static void main(String[] args) {
        Employee accountant = new Employee();
        accountant.calcSalary("Vasya", 1000,2000,3000,5000);
        accountant.calcSalary("Petya", 1000, 3000, 150, 350, 1000);
        accountant.calcSalary("Marfa", 3500);
    }
}
