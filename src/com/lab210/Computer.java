package com.lab210;

public class Computer {

    // Lab 2-1-1
    private String manufacturer = "NPG";
    private int serialNumber = 100001;
    private float price;
    private int quantityCPU = 4;
    private int frequencyCPU = 3;
    private String view;

    // Lab 2-1-2
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }
    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }
    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void view(String view) {
        this.view = view;
        System.out.print("Manufacturer -> " + getManufacturer() + " | ");
        System.out.print("Serial Number -> " + getSerialNumber() + " | ");
        System.out.print("Frequency -> " + getFrequencyCPU() + " | ");
        System.out.print("Quantity -> " + getQuantityCPU() + " | ");
        System.out.print("Price -> " + getPrice());
        System.out.println();
    }
}