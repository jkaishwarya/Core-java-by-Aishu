package com.javaintro;
	

public class TestDemo5 {
	native void hai();
	// by creating object with static to use reference variable in any method block
	static TestDemo5 t1 = new TestDemo5();

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();// static inside static

	}

	static void method1() {
		System.out.println("static method 1 called");
		method2();// static inside static

	}

	void methodi1() {
		System.out.println("instance methodi1 called");
		methodi2();// instance inside instance

	}

	static void method2() {
		System.out.println("static method2 called");
		// TestDemo5 t1 = new TestDemo5();
		t1.methodi1();// instance inside static

	}

	void methodi2() {
		System.out.println("instance methodi2 called");
		method3();

	}

	static void method3() {
		System.out.println("static method3 called");
		// TestDemo5 t2 = new TestDemo5();
		t1.methodi3();// calling istance method with another object;
	}

	void methodi3() {
		System.out.println("instance method3 called");
	}

}
//TO CALL A METHOD INSIDE ANOTHER METHOD SHOULD CALL BY SOME OTHER METHOD THEN ONLY IT EXECUTEDs 