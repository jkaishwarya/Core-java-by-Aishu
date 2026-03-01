package com.javaLanguageFundamentals.Methods;
//Factory method
class Employee {
	int age;

}

public class FactoryMethod {

	public static void main(String[] args) {
		Employee s1 = CreateEmployee();
		s1.age = 65;
		System.out.println(s1.age);

	}

	static Employee CreateEmployee() {// object create
		Employee e = new Employee();
		return e;

	}

}
//🔥 Why is this called Factory Method?
//Because:
//The method CreateEmployee() is creating and returning an object.
//Instead of using new Employee() directly in main,
//we are using a method to create the object.
//👉 A method that creates and returns an object is called a Factory Method.
//🔥 Why use Factory Method?
//In big projects (like your ML malware detection project style architecture 😉):
//You can control object creation.
//You can add extra logic before creating object.
//You can return different types of objects.
//It improves code maintainability.