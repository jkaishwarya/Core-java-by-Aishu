package com.languagefundamentals;

//local variables & class name to access is recommended
public class varTypeTest2 {
	int ClgId;
	static String ClgName = "Vcube";

	public static void main(String[] args) {
		System.out.println(" ***************** var keyword data **************** ");
		var a = 100;
		var b = "String";
		var c = 127;
		var d = 368748472l;
		var e = 215363.4526f;
		var f = 4235347583458.6235726486;
		var g = 32767;
		var h = 'N';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("--------Accessing Variable---------" );
		// Accessing of created local variable
		int ClgId;// variable names can be same because they are temporary
		ClgId = 444;// we should intialize local variable
		String CollegeName = "Malla";
		System.out.println(ClgId);
		System.out.println(CollegeName);
		// to accessing class level variables we need to use classname
		varTypeTest2 v1 = new varTypeTest2();
		System.out.println(v1.ClgId);
		System.out.println(varTypeTest2.ClgName);
		// acessing other class variables
		System.out.println(VarTypesTest1.ClgName);
		VarTypesTest1 v = new VarTypesTest1();
		System.out.println(v.StdId);

	}

}
