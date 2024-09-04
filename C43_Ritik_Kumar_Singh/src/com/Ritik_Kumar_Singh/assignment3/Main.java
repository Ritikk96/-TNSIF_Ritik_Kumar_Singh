package com.Ritik_Kumar_Singh.assignment3;

import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Prompt for the choice
	        System.out.println("Enter your choice (1 for AirIndia, 2 for KingFisher, 3 for Indigo):");
	        int choice = sc.nextInt();

	        // Prompt for the hours of travel
	        System.out.println("Enter the hours of travel:");
	        int hours = sc.nextInt();

	        // Prompt for the cost per hour
	        System.out.println("Enter the cost per hour:");
	        double costPerHour = sc.nextDouble();
            sc.close();
	        Airfare airfare;

	        switch (choice) {
	            case 1:
	                airfare = new AirIndia(hours, costPerHour);
	                break;
	            case 2:
	                airfare = new KingFisher(hours, costPerHour);
	                break;
	            case 3:
	                airfare = new Indigo(hours, costPerHour);
	                break;
	            default:
	                throw new IllegalArgumentException("Invalid choice");
	        }

	        // Calculate and display the total amount
	        double totalAmount = airfare.calculateAmount();
	        System.out.printf("The total amount is: %.2f", totalAmount);
	    }
	}	