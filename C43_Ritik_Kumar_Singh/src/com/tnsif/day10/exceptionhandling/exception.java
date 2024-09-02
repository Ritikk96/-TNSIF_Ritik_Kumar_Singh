package com.tnsif.day10.exceptionhandling;

public class exception {

		public void Demo(){//throws Exception  //Syntax for throws
			int a = 5/0;
			System.out.println(a);
		}
		public void Show() {
		try {
			Demo();
			//throw new Exception(); //Syntax for throw
			
		}catch(Exception e) {
			System.out.println("helllo king");
			System.out.println("Exception---->"+e); //detailed message
		}finally {
			System.out.println("Hello World");
		}
		
	}
		
		public static void main(String[] args){
			exception obj = new exception ();
			obj.Show();
		}
	}


