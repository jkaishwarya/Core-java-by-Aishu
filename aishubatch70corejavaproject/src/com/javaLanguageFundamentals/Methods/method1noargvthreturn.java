package com.javaLanguageFundamentals.Methods;

// no arg+with return type
public class method1noargvthreturn {

	public static void main(String[] args) {
		System.out.println("main methd started");
		method1noargvthreturn t = new method1noargvthreturn();
		t.Employee();// nothing will dispaly
		System.out.println("Employee method called and returned:" + t.Employee());
		double std = method1noargvthreturn.Student();
		System.out.println("Sum of height and weight :"+std);

	}

	int Employee() {
		return 1605;
	}

	static double Student() {
		double height = 150;
		double weight = 45;
		return height + weight;

	}

}
