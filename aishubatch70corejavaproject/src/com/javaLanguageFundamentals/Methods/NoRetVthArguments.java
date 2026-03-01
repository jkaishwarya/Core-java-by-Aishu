package com.javaLanguageFundamentals.Methods;

public class NoRetVthArguments {
	public static void main(String[] args) {
		Greet("Good Morning, have a nice day ",10.00f);
		NoRetVthArguments n = new NoRetVthArguments();
		n.Addition(50, 60, 127);
		n.details(101, "Aishwarya", 'F', true);

	}

	static void Greet(String s, double Time) {
		System.out.println("Greetings: " + s);
		System.out.println("Time: " + Time);

	}

	void Addition(float f, double d, int i) {
		System.out.println(f);
		System.out.println(d);
		System.out.println(i);
		System.out.println("sum of three numbers: " + (f + d + i));

	}// a method can accept n no of arguments

	void Subtraction(double d, float f) {
		System.out.println("Subtraction between two numbers: " + (d - f));
	}

	void details(int Sno, String Name, char Gender, boolean status) {
		System.out.println(+Sno + Name + Gender + status);
		System.out.println(Sno + " " + Name + " " + Gender + " " + status);// nrml
		System.out.printf("%d %s %c %b", Sno, Name, Gender, status);// using printf method
		System.out.println();
		String result = String.format("%d %s %c %b", Sno, Name, Gender, status);// using string format
		System.out.println(result);

	}

}
