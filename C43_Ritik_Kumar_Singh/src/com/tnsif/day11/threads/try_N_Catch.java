package com.tnsif.day11.threads;

public class try_N_Catch {
	public static void main(String[] args) {
		System.out.println("here is the try block");
		try {int data=100/0;
		}catch(Exception e){
			System.out.println(e);
		
		}
	}
}
