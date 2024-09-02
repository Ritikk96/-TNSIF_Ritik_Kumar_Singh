package com.tnsif.day10.exceptionhandling;
 import java.util.Scanner;
public class expdemo {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    try {
	    	System.out.println("enter thhe number");
	    	int number = sc.nextInt();
	    	System.out.println(number%2 == 0  ? number + " is even " : " is odd"  );
	    	return;
	    
	    	
	    }
	    catch(Exception e) {
	    	
	    	System.err.println("Invalid input");
	    	
	    }finally{
	    	System.out.println("in Finally");
	    	sc.close();
	  
	   }
	}
}
