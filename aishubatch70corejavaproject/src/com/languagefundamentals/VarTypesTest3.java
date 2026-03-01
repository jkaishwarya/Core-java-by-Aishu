package com.languagefundamentals;
// about warning why ew don't

public class VarTypesTest3 {
	int Num = 1605;
	static String Name = "Nagaraju";

	public static void main(String[] args) {
		VarTypesTest3 s1=new VarTypesTest3();
		System.out.println(s1.Num);
		System.out.println(s1.Name);
		VarTypesTest3 s2=new VarTypesTest3();
		System.out.println(s2.Num);
		System.out.println(s2.Name);		
		VarTypesTest3 s3=null;//null. is consider as nullpointerException 
	//	System.out.println("---->:"s3.Num);
		System.out.println("----->:"+s3.Name);//here it is not impacted
		
	}

}
