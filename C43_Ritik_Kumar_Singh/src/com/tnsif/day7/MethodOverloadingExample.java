package com.tnsif.day7;

public class MethodOverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();
        System.out.println("Sum of two integers: " + example.add(5, 10));
        System.out.println("Sum of three integers: " + example.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + example.add(5.5, 10.5));
    }
}
