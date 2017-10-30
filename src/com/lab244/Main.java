package com.lab244;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Adam","Gontier", "Canada", 1234567890);
        Employee emp2 = new Employee("Marilyn","Manson", "USA", 1234567890);
        Employee emp3 = new Employee("Benjamin","Burnley", "USA", 1234567890);

        emp1.printFields();
        emp2.printFields();
        emp3.printFields();

        System.out.print("Number of Employees -> " + Employee.getNumberOfEmployee());

    }

}
