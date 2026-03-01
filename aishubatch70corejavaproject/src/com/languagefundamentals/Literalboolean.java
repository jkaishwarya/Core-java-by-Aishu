package com.languagefundamentals;

// for boolean we only use either true or false
public class Literalboolean {

	public static void main(String[] args) {
		boolean b = true;
		boolean b1 = false;
		System.out.println(b);
		System.out.println(b1);
		Boolean b2 = true;
		System.out.println(b2);
//used for condtional statements
		if (b) {
			int a = 10;
			System.out.println(a);
		}
		System.out.println();
		if(b1) {
			System.out.println("helloworld");
		}
		if(b1==true) {
			System.out.println("b1 is true");
		}
		else {
			System.out.println("else block executed");
			System.out.println("b1 is false");
		}

	}

}
