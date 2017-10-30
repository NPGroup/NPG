package com.lab224;

public class Person {
    private String firstName = "First name";
    private String lastName = "Last name";
    private int age = 0;
    private String gender = "Unknown";
    private int phoneNumber = 0;

    public void about(String firstName, String lastName, String gender) {
        System.out.println("First name -> " + firstName + " | Last name -> " + lastName + " | Gender -> " + gender);
    }

    public void about(String firstName, String lastName, int age) {
        System.out.println("First name -> " + firstName + " | Last name -> " + lastName + " | Age -> " + age);
    }

    public void about(String lastName, int phoneNumber) {
        System.out.println("Last name -> " + lastName + " | Phone number -> " + phoneNumber);
    }

    public void about(String firstName, int age, int phoneNumber) {
        System.out.println("First name -> " + firstName + " | Age -> " + age + " | Phone number -> " + phoneNumber);
    }

    public void about(String firstName, String gender, int age, int phoneNumber) {
        System.out.println("First name -> " + firstName +  " | Gender -> " + gender + " | Age -> " + age + " | Phone number -> " + phoneNumber);
    }
}
