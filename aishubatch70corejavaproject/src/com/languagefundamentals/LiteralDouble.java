package com.languagefundamentals;

public class LiteralDouble {

	public static void main(String[] args) {
		double f = 127;// int
		double F=125.0f;
		double f1 = 32767;// short
		double f2 = 2147483647;// int
		double f3 = 912345263778l;//long
		double f4=04325;//oct---> int ----float
		double f5=04325f;
		double f11=0123.5f;
//		double f15=0123.5;not valid
		double f6=0x76183;//hexa dec--->int-->float
		double f10=0xDAD;
		double f7=0X242356f;
//		double f17=0x124.45f;
//		double f12=0xAbC.5f;not valid-->hexa or decimal
		double f8=0b01110;
//		double f9=0b11111F;//not valid because ambiguity
//		double f13=0b1011.10;not valid 
		double f14=2324328478957.4568735723;
//		double f16=0b1010.11f;
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
		System.out.println(f14);
		

	}

}
