package com.lab224;

public class Main {
    public static void main(String[] args) {
        Person somebody = new Person();
        somebody.about("Andrew", "Nudchenko", "Man");
        somebody.about("Marilyn", "Manson", 48);
        somebody.about("Pupkin", 1234567890 );
        somebody.about("Marfa", 18, 1234567890);
        somebody.about("Praskovya", "Female", 26, 123456789);
    }
}
