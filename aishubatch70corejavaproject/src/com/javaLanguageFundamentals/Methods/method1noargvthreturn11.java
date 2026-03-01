package com.javaLanguageFundamentals.Methods;

public class method1noargvthreturn11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Employee age is :" + getEmployee());
		method1noargvthreturn11 s = new method1noargvthreturn11();
		System.out.println(" salary is :" + s.Salary());
		System.out.println(" salary is :" + s.Bonus());
		System.out.print("Total Salary is :"+s.Salary()+s.Bonus());//500000.020000.0
		System.out.println("Total salary is :"+(s.Salary()+s.Bonus()));
//		System.out.println("returns only Salary:"+s.SalarywithBonus());//1.0E7-->
//		System.out.println("returns only Bonus:"+s.SalarywithBonus());//3000000.0
		System.out.println("Now its returning salary with bonus:"+s.SalarywithBonus());//1.3E7
		

	}

	static int getEmployee() {
		int age = 22;
		return age;
//		return 22;
	}

	double Salary() {
		double salary = 500000;
		return salary;
	}

	float Bonus() {
//		return 20000; or
//		int Bonus=20000;//This method must return a result of type float so,
		float Bonus = 20000;//orfloat Bonus = 20000.00f;
		return Bonus;
	}
	double SalarywithBonus() {
		double Salary=10000000;
		double Bonus=3000000;
//		return Salary;
//		return Bonus;
		return Salary+Bonus;
	}

}
