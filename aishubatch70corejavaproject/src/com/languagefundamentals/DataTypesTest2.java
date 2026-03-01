package com.languagefundamentals;

public class DataTypesTest2 {

	public static void main(String[] args) {
		Character c = 'M';// primitive value stored in wrapper datatypes
		System.out.println(c);
		System.out.println("----Auto-Boxing----");
		// "Auto Boxing":- we should use wrapper classes to respective primitive data
		// type value to store
		byte b = (byte) 1003;
		Byte b1 = b;// storing byte value to wrapper obj class
		System.out.println(b1);// converting byte primitive value to wrapper obj class
		System.out.println("----Auto-UnBoxing----");

		Long l = 11125673L;// storing primitive value to wrppr also called Auto boxing
		long l1 = l;
		System.out.println(l1);// Auto-Unboxing:-converting wrp to primitive data type
		System.out.println("----== opr concept----");
		Float f1 = 53625.5f;
		Float f2 = 53625.5f;
		System.out.println(f1 == f2);// ----> why -because cache range is from -128 to 127
		Character c2 = 'N';
		Character c1 = 'A';
		System.out.println(c1 == c2);
		int i2 = 20;
		int i3 = 20;
		System.out.println(i2 == i3);
	}

}
