package com.languagefundamentals;

//user defined class 
//where we can access data of that class in another classes
class Student {
	int id = 1605;
	String Name = "Nagaraju";
	static byte b = 127;// why we can't use static for

}

class Address {
	int CarNo = 1001;
	String CarName = "BMW";
}

public class DataTypesTest4 {

	public static void main(String[] args) {
		System.out.println("byte value :" + Student.b);
		Student s = new Student();
		System.out.println("int id :" + s.id);
		System.out.println("StringName :" + s.Name);
		Address a = new Address();
		System.out.println("CarNo :"+a.CarNo);
		System.out.println("CarName :"+a.CarName);

	}

}
