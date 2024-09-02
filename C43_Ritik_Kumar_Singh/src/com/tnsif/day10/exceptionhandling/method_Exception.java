package com.tnsif.day10.exceptionhandling;

public class method_Exception {
	
	public void demo() {
		int a = 5/0;
		System.out.println(a);
	}
	public void show() {
		try {
			demo();
			
		}catch(Exception e) {
			System.out.println("exception...>>");
		}finally {
			System.out.println("in finally")1;
		}
	}

}
