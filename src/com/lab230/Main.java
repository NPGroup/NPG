package com.lab230;

public class Main {
    public static void main(String[] args) {
        MyWindow inst1 = new MyWindow();
        inst1.setWidth(41);
        inst1.setHeight(42);
        inst1.setNumberOfGlass(3);
        inst1.setColor("Red");
        inst1.setIsOpen(true);
        inst1.printFields();

        MyWindow inst2 = new MyWindow();
        inst2.setWidth(23);
        inst2.setHeight(32);
        inst2.setNumberOfGlass(2);
        inst2.setColor("Blue");
        inst2.setIsOpen(false);
        inst2.printFields();

        MyWindow inst3 = new MyWindow();
        inst3.setWidth(34);
        inst3.setHeight(43);
        inst3.setNumberOfGlass(4);
        inst3.setColor("Green");
        inst3.setIsOpen(false);
        inst3.printFields();

        MyWindow inst4 = new MyWindow();
        inst4.setWidth(45);
        inst4.setHeight(54);
        inst4.setNumberOfGlass(4);
        inst4.setColor("Yellow");
        inst4.setIsOpen(true);
        inst4.printFields();

        MyWindow inst5 = new MyWindow();
        inst5.setWidth(56);
        inst5.setHeight(65);
        inst5.setNumberOfGlass(5);
        inst5.setColor("Violet");
        inst5.setIsOpen(true);
        inst5.printFields();
    }
}
