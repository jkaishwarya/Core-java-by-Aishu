package com.javaLanguageFundamentals.Methods;

import java.util.Scanner;

public class TypeCastingOfMethod {

	int Method1() {// valid-implicit type casting
		return 'A';
	}

	char Method2() {// valid-implicit type casting
		return 22;
	}

	char Method3() {
		int a = 65;
		return (char) a;// explicit
	}

	static char Method4(char c) {
		return  c;
	}

	public static void main(String[] args) {
		TypeCastingOfMethod t = new TypeCastingOfMethod();
		System.out.println(t.Method1());
		System.out.println(t.Method2());
		System.out.println(t.Method3());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char value: ");
		char gend = sc.next().charAt(0);
		System.out.println("Char value is returning: " + Method4(gend));
		System.out.println("Char value is returning: " + Method4(gend));
		sc.close();
		
	}

}
