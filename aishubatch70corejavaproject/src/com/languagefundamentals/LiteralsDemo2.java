package com.languagefundamentals;

public class LiteralsDemo2 {

	public static void main(String[] args) {
		// floating literals
		float f = 127;// int
		float F=125.0f;
		float f1 = 32767;// short
		float f2 = 2147483647;// int
		float f3 = 912345263778l;//long
		float f4=04325;//oct---> int ----float
		float f5=04325f;
		float f11=0123.5f;
//		float f15=0123.5;not valid
		float f6=0x76183;//hexa dec--->int-->float
		float f10=0xDAD;
		float f7=0X242356f;
//		float f17=0x124.45f;
//		float f12=0xAbC.5f;not valid-->hexa or decimal
		float f8=0b01110;
//		float f9=0b11111F;//not valid because ambiguity
//		float f13=0b1011.10;not valid 
//		float f14=2324328478957.4568735723;// not valid because it consider as double
//		float f16=0b1010.11f;
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
		System.out.println(f10);
		System.out.println(F);
		System.out.println(f11);
		
		
	}

}
