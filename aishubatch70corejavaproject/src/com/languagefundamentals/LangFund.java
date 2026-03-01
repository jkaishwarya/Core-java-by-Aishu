package com.languagefundamentals;

public class LangFund {

	static String School_Name = "Little Star";
	static int School_id = 1605;
	int var;

	int _Std_id;
	String $td_Name;

	public static void main(String[] _$args) {
		System.out.println("main method started");
		LangFund L1 = new LangFund();
		System.out.println("School_Name: " + School_Name);
		System.out.println("School_id: " + School_id);
		L1._Std_id = 10;
		L1.$td_Name = "Aishwarya";
		System.out.println("_Std_id: " + L1._Std_id);
		System.out.println("$td_Name: " + L1.$td_Name);
		L1._hello$();

	}

	void _hello$() {
		System.out.println("hello method called");
		var a = 26;
		var b = "Aishu";
		System.out.println(a);
		System.out.println(b);
	}

}
