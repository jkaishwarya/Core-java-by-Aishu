package com.languagefundamentals;

//#19-Datatypes 01 lecture(friday)

public class DataTypesTest1 {
	// by default RHS numerical value is int value
	byte b;// -128 to 127(-2^7 to 2^7-1)
	byte b1 = 127;
	byte b2 = (byte) 129;// explicit type casting (int-->byte)
	byte b3 = (byte) 256l;// s/i/l/f/d to int
	byte b4 = (byte) 300;
	int i1 = b4;// implicit type casting (byte to int)
	short s = (short) 35796;// -32768 to 32767 (-2^15 to 2^15-1)
	short s1 = 32767;
	short s2 = (short) 427684d;// long or int or float or double to short
	long l1 = s;

	int i = 2147483647;// -2147483648 to 2147483647(-2^31 to 2^31-1)
	// we can give like this for type casting int i2=(int)2147483648
	// if give 2147483648---> Error:The literal 2147483648 of type int is out of
	// range b/z its a default value
	int i2 = (int) 2147483648l;// l/f to int
	int i3 = (int) 2147483648567L;
	long l2 = i3;// int to long
	long l = 9223372036854775807L;// or 9223372036854775807L;
	// 9223372036854775808(-2^63) to 9223372036854775807(-2^63-1)

	// by default here double are default values
	float f1 = 5436787.6574124f;// or F
	float f = 54.05f;
	float f2 = 54367874775665741244675F;// after reaching a maxmum range of long we can print that numbers in float
	double d1 = 5436787.6574124;// or5436787.6574124D/ 5436787.6574124d
	double d = 670000.000;
	double d2 = (float) 6578348.8578456f;// d/D/not provide also double into float
	char c = 'N';
	char c1 = 74;// implicit type cast from int to char
	// we cannot store 'Sr" i.e collection chars into char
	char c2 = '\u0040';// uni code or hex code
	int i4 = 'N';// it also implicit type caste from integer to char
	boolean bo;
	boolean bo1 = true;
	boolean bo2 = true;
	boolean bo3 = false;

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("------------------------------------------------------------");
		DataTypesTest1 t = new DataTypesTest1();// 0
		System.out.println("byte value b: " + t.b);// 0
		System.out.println("byte value b1: " + t.b1);// 127
		System.out.println("byte value b2: " + t.b2);// -128
		System.out.println("byte value b3: " + t.b3);// 0
		System.out.println("byte value b4: " + t.i1);// byte value :44

		System.out.println("------------------------------------------------------------");
		System.out.println("short value s :" + t.s);// 0--->-29740
		System.out.println("short value s1 :" + t.s1);// 32767
		System.out.println("short value s2 :" + t.s2);// -31068

		System.out.println("------------------------------------------------------------");
		System.out.println("int value i: " + t.i);// 0--->2147483647
		System.out.println("int value i: " + t.i);// -2147483647
		System.out.println("int value l2: " + t.l2);// 567
		System.out.println("------------------------------------------------------------");

		System.out.println("long value l : " + t.l);// 0----->9223372036854775807
		System.out.println("------------------------------------------------------------");

		System.out.println("float value f: " + t.f);// 0.0--->5436787.5
		System.out.println("float value f1: " + t.f1);// 5436787.5
		System.out.println("float value f2: " + t.f2);// 5.4367876E11
		System.out.println("------------------------------------------------------------");
		System.out.println("double value d : " + t.d);// 0.0
		System.out.println("double value d1: " + t.d1);// 5436787.6574124
		System.out.println("double value d2: " + t.d2);// 6578349.0
		System.out.println("------------------------------------------------------------");
		System.out.println("char value c:" + t.c);// N
		System.out.println("char value c1:" + t.c1);// J
		System.out.println("char value c2:" + t.c2);// @
		System.out.println("int value i4:" + t.i4);// 78
		System.out.println("------------------------------------------------------------");
		System.out.println("boolean value :" + t.bo);// false
		if (t.bo1) {
			System.out.println("my age 16");
		} // for false it print /display nothing
		if (t.bo2) {
			// bo2 is true so,if block exe
			System.out.println("iam a good girl");
		} else {
			System.out.println("i love puppies");
		}
		if (t.bo3) {
			// bo3 is false so else block exe
			System.out.println("iam a good girl");
		} else {
			System.out.println("i love puppies");
		}
	}//boolean only allows either this "true" word or "false" word only
// for boolean invalid assignments are:-
//	boolean b = 0;
//	boolean b = 1;
//	boolean b = True;
//	boolean b = False;
//	boolean b = "TRUE";
//	boolean b = "FALSE";
//  boolean b='true';
//	boolean b='false';														

}
