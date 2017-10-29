package com.lab230;

public class Main {
    public static void main(String[] args) {
        MyWindow[] inst = new MyWindow[5];
        inst[0] = new MyWindow();
        inst[0].printFields();
        inst[1] = new MyWindow(14);
        inst[1].printFields();
        inst[2] = new MyWindow(15, 16);
        inst[2].printFields();
        inst[3] = new MyWindow(17, 18, 19);
        inst[3].printFields();
        inst[4] = new MyWindow();
        inst[4].printFields();
    }
}
