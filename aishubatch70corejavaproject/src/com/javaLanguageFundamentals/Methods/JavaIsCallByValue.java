package com.javaLanguageFundamentals.Methods;

public class JavaIsCallByValue {
	String name;
	int age;

	public static void main(String[] args) {
		JavaIsCallByValue j1 = new JavaIsCallByValue();
		Method(j1);
		JavaIsCallByValue j2 = new JavaIsCallByValue();
		System.out.println(Method1(j2));

	}

	static void Method(JavaIsCallByValue j) {
		System.out.println(j);
		j.age = 1605;
		System.out.println("age: " + j.age);
	}

	static JavaIsCallByValue Method1(JavaIsCallByValue j3) {
		j3.name = "Aishu";
		System.out.println("Name: " + j3.name);
		return j3;
	}

}
