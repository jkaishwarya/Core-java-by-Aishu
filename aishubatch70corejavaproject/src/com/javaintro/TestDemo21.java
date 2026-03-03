package com.javaintro;

public class TestDemo21 {


		
		{
			System.out.println("instance block at beginning");
		}
		static {
			System.out.println("static block at begginning called ");
			
		}
		
		static TestDemo2 t1 = new TestDemo2();
		
		public static void main(String[] args) {
			System.out.println("main method1 started");
//			
		}

		static {
			System.out.println("static block1 called");
			TestDemo2 t1 = new TestDemo2();
		}
		static{
			System.out.println("static block3 called");
		}
		{
			System.out.println("instance block1 called");//it runs everytime object is created		
		}
//		{
//			System.out.println("instance block2 called");
		//	TestDemo2 t1 = new TestDemo2(); it gives 
//		}

}

//