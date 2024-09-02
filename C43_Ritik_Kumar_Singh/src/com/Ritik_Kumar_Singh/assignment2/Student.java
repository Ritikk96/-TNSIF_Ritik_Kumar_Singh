package com.Ritik_Kumar_Singh.assignment2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your roll no");
		double rollno=sc.nextDouble();
		 System.out.println("Enter your grade");
		char grade=sc.next().charAt(0);
		 System.out.println("Enter your percentage");
		float percent=sc.nextFloat();
		
	    System.out.println(name);
	    System.out.println(rollno);
	    System.out.println(grade);
	    System.out.println(percent);
	}
}

