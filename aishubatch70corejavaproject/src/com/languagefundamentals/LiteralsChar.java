package com.languagefundamentals;

public class LiteralsChar {

	public static void main(String[] args) {
//	char c='null';
//	char cc=null;
		char c1 = 'N';
		char c2 = '\u0040';// unicoe or hexa code
		char c3 = 65535; // integer can acceptable-->junk values not predictable
//	char c4='\iface';//not valid
		char c5 = 0xDad;// hexa--->int--->char take it as ASCII values
//	char c8='slashu0xAc';
//'slashu0xAc' is invalid because:
//After slashu, Java requires exactly 4 hex digits
//x is not a hex digit

//  0x is only valid in numeric literals, not Unicode escapes
//	slash u + 4 hex digits
//	Java slashuXXXX only supports 4 hex digits.
//	For characters above FFFF, you must use Surrogate pairs
		String s = "\uD83D\uDE00";
		char c7 = '\u0b10';// ob is a part of numerical literals so it accept this value
		char c6 = '\u0Ace';
//	unicode with hexa decimal cannot be acceptable
		System.out.println("c1 :" + c1);
		System.out.println("s :" + s);
		System.out.println("c2 :" + c2);
		System.out.println("c3 :" + c3);
		System.out.println("c7 :" + c7);
		System.out.println("c5 :" + c5);
		System.out.println("c6 :" + c6);

	}

}
