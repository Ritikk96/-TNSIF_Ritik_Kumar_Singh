package com.tnsif.day6.inheritance;
	
abstract class value{
	void show() {
		System.out.println("Abstract");
	}
}
class Room extends value{
     void demo() {
    	 System.out.println("Print");
     }

public class Student {
      
	
	public static void main(String[] args) {
		Room obj=new Room();
		obj.show();
		obj.demo();
	}
	}
}
	   

