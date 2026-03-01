package com.languagefundamentals;

public class LiteralNull {
//null only can assign too bject datatypes and class,object
	public static void main(String[] args) {
		String s = null;
//	String ss='NULL';not valid
//	String s3=NULL;not valid
		String s1 = "NUll";
//	String s4=new String(null);
		String s4 = new String("null");
//	LiteralNull l=new LiteralNull(null);
//used to values upgrade values later 
		LiteralNull l = null;
		l = new LiteralNull();// -->null to occupied/alocated some space
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(l);// @1dbd16a6
// also we can use for wrapper object datatypes
//		BooLean b =null; except this
		Long l1 = 923456752l;
		Long l2 = null;
		Integer i4 = null;
		System.out.println(l1);
		System.out.println(l2);// @1dbd16a6
		System.out.println(i4);
	}

}
