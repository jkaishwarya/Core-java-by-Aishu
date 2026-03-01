package com.languagefundamentals;

public class VarTypesTest1 {

	int StdId = 101;// pri+ins
	String StdName;// obj+ins
//------------------------------------//
	static String ClgName = "TsWriEs";// obj+stat
	static int ClgId;// pri+stat

	public static void main(String[] args) {
		System.out.println("main method started from VarTypesTest1");
		// Access instance variables
		VarTypesTest1 v = new VarTypesTest1();
		v.StdId = 143;// when we give int -The primitive type int of v does not have a field
						// StdName--- it means
		// we cannot access object with classname ,only wecan access with object
		v.StdName = "Mrce";
		System.out.println("instance1 :" + v.StdId);
		System.out.println("instance2 :" + v.StdName);
		// Access static data members directly
		System.out.println("DirAceStat1 :" + ClgName);
		System.out.println("DirAceStat2:" + ClgId);
		// Access static data using class name
		VarTypesTest1.ClgName = "MallaReddy College of Engineering";
		System.out.println("class1 :" + VarTypesTest1.ClgName);
		System.out.println("class2 :" + VarTypesTest1.ClgId);
		// Access static data using object reference variable
		v.ClgId = 121;
		System.out.println("objAcess1 :" + v.ClgName);// The static field VarTypesTest1.ClgName should be accessed in a
														// static way
		System.out.println("objAcess2 :" + v.ClgId);// give warning above|----> because it has no impact-->in
													// vartypetest3

	}

}
