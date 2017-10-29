package com.lab230;

public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void printFields() {
        System.out.print("Ширина -> " + getWidth() + " | ");
        System.out.print("Высота -> " + getHeight() + " | ");
        System.out.print("Количество чашек -> " + getNumberOfGlass() + " | ");
        System.out.print("Цвет -> " + getColor() + " | ");
        System.out.print("Окно открыто -> " + getIsOpen());
        System.out.println();
    }
}
