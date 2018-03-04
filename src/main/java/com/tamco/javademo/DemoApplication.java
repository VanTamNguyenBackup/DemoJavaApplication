package com.tamco.javademo;

public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("You have something to show me?");
        System.out.println("I want to show you something.");
        System.out.println("I know how to add two numbers, 4 + 5 equals to: " + (new Addition().add(4, 5)));
    }
}
