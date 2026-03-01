package com.javaintro;
//#11 JVM ARCh-O5

public class TestDemo3 {
	static int a = 10;// this store or data allocted in method area
	int b = 12;// allocted data in heap area dynamically
// if don"t have any static data/static Related information then only
//	main method executed first 

	public static void main(String[] args) {
		System.out.println("main method started from TestDemo3");
		System.out.println(a);
		TestDemo3 t1 = new TestDemo3();
		System.out.println(t1.b);

	}

// JVM checks static data first and print only method is created
	static {
		System.out.println("Hello World!!");
		TestDemo3 t1 = new TestDemo3();
		System.out.println(t1.b);
	}

}
//method:all static related data alocated and also meta data of class
//in heap:all instance related data allocated dynamically
// can we accesing one Static block object reference on another static block 