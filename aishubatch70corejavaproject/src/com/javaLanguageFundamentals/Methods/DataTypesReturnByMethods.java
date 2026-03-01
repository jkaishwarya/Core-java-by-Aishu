package com.javaLanguageFundamentals.Methods;

public class DataTypesReturnByMethods {

	public static void main(String[] args) {
		System.out.println("----------Student Information---------");
		System.out.println("Student id :" + Studentid());
		System.out.println("Student Name :" + name());
		DataTypesReturnByMethods d = new DataTypesReturnByMethods();
		int age = d.age();
		System.out.println("Student age :" + age);
		System.out.println("Student gender: " + d.gender());
		System.out.println("Student height: " + d.height());
		System.out.println("Student weight: " + DataTypesReturnByMethods.weight());
		System.out.println("student Rank: " + d.Rank());
		System.out.println("IsStudentPass: " + Pass_Status());

	}

	static int Studentid() {
		return 1605;
	}

	static String name() {
		String name = new String("Nagarju");
//		String name = "Aishwarya";
		return name;
	}

	int age() {
		return 25;
	}

	char gender() {
		char c = 77;
		return c;
	}

	double height() {
		double d = 156.00f;
		return d;
	}

	static float weight() {
		float f = (float) 58.42d;
		return f;
	}

	byte Rank() {
		byte b = (byte) 257;
		return b;

	}

	static boolean Pass_Status() {
		boolean b = true;
		return b;

	}

}
