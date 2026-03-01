package com.languagefundamentals;
//The number of unique digits (including 0) that a number system uses.
//Base = total number of digits available
//In number systems, the base (also called the radix) tells you how many unique digits are used and how place values work.
//What does “base” mean in octal literals?//
//An octal literal is a number written in base 8.//
//That means:
//The base is 8
//Only digits 0–7 are allowed
//Each position represents a power of 8 (not 10)
public class LiteralsDemo1 {
	public static void main(String[] args) {
		//Decimal Literals(0-9),base-10--->1*10^2+2*10^1+7*10^0
		 int a=127;//0*10^3+1*10^2+2*10^1+7*10^0=127
		 int b=168;
		 System.out.println("---Decimal Literals----");
		 System.out.println(a);
		 System.out.println(b);
		 //octal Literal,base-8,(0-7) allowed,starts with 0
		 int c=0135;//0*8^3+1*8^2+3*10^1+5*10^0 =
		 int d=0143;
		 System.out.println("---Octal Literals----");
		 System.out.println(c);
		 System.out.println(d);
		 //Hexadecimal Literals ,base-16,(0-9 & a-f or A-F)
		 //where a=10,b=11,c=12,d=13,e=14,f=15  starts with 0X or 0x
		  int p=0x1235;//valid
		  int q=0XDad;//valid
		  //int r=0XDeer;//not valid
		  System.out.println("---hexa Decimal Literals----");
		  System.out.println(p);
		  System.out.println(q);
		  //binary literals ,base-2,(0-1), statrs with 0b
		  int x=0b0010;
		  int y=0b11011;
		  System.out.println("---Binary Literals----");
		  System.out.println(x);
		  System.out.println(y);
	}

}
