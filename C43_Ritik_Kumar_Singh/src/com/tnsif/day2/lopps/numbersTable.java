package com.tnsif.day2.lopps;

public class numbersTable {
    public static void main(String[] args) {
        int number = 5; // You can change this to any number
        int range = 10; // This is the range up to which the table will be printed

        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

