package com.Ritik_Kumar_Singh.assignment2;

import java.util.Scanner;

public class Circle {
	    double radius;
	    String color;

	    public void getInput() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the radius of the circle:");
	        radius = sc.nextDouble();
	        System.out.println("Enter the color of the circle:");
	        color = sc.next();
	    }
	    public void calcArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("The area of the circle with radius " + radius + " and color " + color + " is " + area);
	    }

	    public static void main(String[] args) {
	        Circle circleshape = new Circle();
	        circleshape.getInput();
	        circleshape.calcArea();
	    }
	}


