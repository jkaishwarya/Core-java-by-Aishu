package com.javaLanguageFundamentals.Methods;

//static method and instance method
public class method3Test3 {

	public static void main(String[] args) {
		System.out.println("main method started to call static and instance blocks");
		System.out.println("---method1 called---");
		method3Test3.method1();
		method1();
		method3Test3 m = new method3Test3();
		m.method1();//warning :The static method method1() from the type method3Test3 should be accessed in a static way
		method3Test3 m1 = new method3Test3();
		m1.method2();

	}

	static void method1() {
	
		int a = 10, b = 20;
		System.out.println("Addition of two numbers :" + (a + b));
	}

	void method2() {
		System.out.println("---method2 called---");
		double mrp = 250, dis = 50;
		System.out.println("actual price of product :" + (mrp - dis));
	}

}
