package com.javaLanguageFundamentals.Methods;

import java.util.Scanner;

public class VthRetArgScanner {

	static int method1(int age) {
		int c = age;
		return c;
	}

	static long method2(long phnno) {
		return phnno;
	}

	static void method(int a) {
		System.out.println("a value is:" + a);
	}

	static String NameMethod(String name) {
		return name+" " + "jk";
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int age = sc.nextInt();
		System.out.print("Enter your a value: ");
		int a = sc.nextInt();
		System.out.print("Enter your phnno: ");
		long phnno = sc.nextLong();
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.println("_________________________");
		System.out.println("your Name is: " + NameMethod(name));
		System.out.println("Your Age is : " + method1(age));
		System.out.println("Your Phnno is : " + method2(phnno));
//		b = method(a);why can't we store like this....
//		System.out.println(b);
		method(a);
		sc.close();
	}

}
