package com.javaintro;
//#12 JVM ARCh-05
//static executes whenever class loads
//instance block executes whenever object loads

public class TestDemo2 {
	{
		System.out.println("instance block at beginning");
	}
	static {
		System.out.println("static block at begginning called ");//if static block before variable this block executes first
		
	}
	//TestDemo2 t1 = new TestDemo2();//if we create instance object outside class will not execute/load instance block b./z we cannot access
	
	static TestDemo2 t1 = new TestDemo2();//it executes instance block automatically and jvm executes variables first
	
	// we gave static because to access from 
//	public static void main(String[] args) {
//		System.out.println("main method1 started");
//		TestDemo2 t1 = new TestDemo2();to execute instance block inside main method 

//	}
	void main() {
		System.out.println("main method2 started");
	}
	static {
		System.out.println("static block1 called");
		TestDemo2 t1 = new TestDemo2();// Jvm executes static block first
		System.out.println(t1);
	}
	static {
		System.out.println("static block3 called");// we can create multiple static blocks
	}
	{
		System.out.println("instance block1 called");// to execute this block we need to create object
	}
	{
		System.out.println("instance block2 called");//we can create multiple instance block
	}

}
