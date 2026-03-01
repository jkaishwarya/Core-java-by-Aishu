package com.javaLanguageFundamentals.Methods;
//pending : need to work access same values  of different data types for method 
//calculation 
public class methodTest2 {
//creating no_argument+return_type
	static void powerof() {
		int a=2;
		int b=3;
		System.out.println(a^b);//1 --> because ). The caret symbol (^) is the bitwise XOR operator,
						                         //not an exponentiation operator. 
	}
	void add() {
		byte a = 127;
		byte b = 60;
		System.out.println(a + b);
	}

	void sub() {
		long a = 9223372036854775807l;
		long b = 9223372036854775L;
		System.out.println(a - b);
	}

	static void mul() {
		short a = 32767;
		short b = 32767;
		System.out.println(a * b);
	}

	void div() {
		float a = 5436787.6574124f;
		float b = 54367.6574f;
		System.out.println(a / b);

	}

//	public static void main(String[] Aishwarya) {
//		methodTest2 m = new methodTest2();
//		m.main();

//	}

	void mod() {
		double a = 54367874567.657412412345;
		double b = 4565765.5437679;
		System.out.println(a % b);
	}

//	void main() {
//		System.out.println("main method started");
//		add();
//		sub();
//		mul();
//		div();
//		mul();
//		System.out.println("main method ended");
	public static void main(String[] args) {
		System.out.println("main method started");
		methodTest2 m=new methodTest2();
		m.add();
		m.sub();
		mul();////mul();or methodTest2.mul();orm.mul();
		m.div();
		methodTest2.mul();
		m.powerof();
		System.out.println("main method ended");
		
		

	}

}
