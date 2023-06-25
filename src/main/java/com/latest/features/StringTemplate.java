package com.latest.features;

public class StringTemplate {
    public static void main(String[] args) {
        int age = 23;
        String firstName = "Rajasekhar";

        System.out.println("My name is " + firstName + ", I am " + age + " years old.");
//        System.out.println(STR."My name is \{firstName}, I am \{age} years old");  java 21
    }
}
