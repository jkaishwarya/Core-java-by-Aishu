package com.languagefundamentals;

public class Literalstring {

	public static void main(String[] args) {
		String s = "null";
		String s1 = null;
		String s2 = "Aishwarya";// ----->stored in Scp(String Constant pool)-->separate memory in heap
		String s3 = "Aishwarya";// ----->it also refer to same object i.e Aishwarya in Scp
		String s4 = new String("Aishwarya");// ------->in heap it new memory location will be allocate
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
//		we have concept == operator which tells whether both are same or not
// 		if two variables refer same object -- gives true
// 		else even though content of or value of variable s are same -->gives false
//		System.out.println("s2==s3 :"+s2==s3);+ (String concatenation) has higher precedence than ==.+ evaluates first 
		// so it considering +s3 that why its giving false to we need use()
		System.out.println("s2==s3 :" + (s2 == s3));
		System.out.println("s3==s4 :" + (s3 == s4));
		System.out.println("s2==s4 :" + (s4 == s2));
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println(s4 == s2);

	}

}
