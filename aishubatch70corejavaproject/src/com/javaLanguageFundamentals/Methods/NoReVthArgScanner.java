package com.javaLanguageFundamentals.Methods;

//doubt at last
import java.util.Scanner;

public class NoReVthArgScanner {

	public static void main(String[] args) {
		System.out.println("main metho started - about how to read values from console");
//The constructor Scanner() is undefined- so,we use Scanner(inputstream)-parameterized constructor
		NoReVthArgScanner n = new NoReVthArgScanner();
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------int--------------");
		System.out.println("Enter Age:");
		int age = sc.nextInt();

		System.out.println("--------------String------------");
		System.out.println("Enter your FirstName: ");
		String fname = sc.next();
		System.out.println("Enter your LastName: ");
		String lname = sc.next();

		System.out.println("-------------Long----------------");
		System.out.println("Enter your PhoneNumber:");
		long Phnno = sc.nextLong();// Long also
//System.out.println("My Phone Number is: " + MyPhnNo(Phnno));The operator + is undefined for the argument type(s) String, void why?
//Because If you want to use a method inside System.out.println(), it must return a value.(here method is returntype is void)

		System.out.println("--------------char----------------");
		System.out.println("Enter your Gender: ");
//In Java, Scanner does not have a direct method to read a single char like nextChar() 
//So we read a String first, then take the first character from it.
		char gender = sc.next().charAt(0);

		System.out.println("-------------double-----------");
		System.out.println("Enter your height: ");
		double d = sc.nextDouble();

		System.out.println("------------float-------------");
		System.out.println("Enter your weight:");
		float f = sc.nextFloat();

		System.out.println("------------short-------------");
		System.out.println("Enter your total marks:");
		short s = sc.nextShort();
		System.out.println("Enter marks you obtained:");
		short s1 = sc.nextShort();
		System.out.println("-------------Byte-------------");
		System.out.println("Enter marks you omitted:");
		byte b = sc.nextByte();//doubt how to typecast
		System.out.println("--------your details--------");		
		n.MyName(fname, lname);
		n.MyAge(age);
		MyPhnNo(Phnno);
		MyGender(gender);
		MyHeight(d);
		MyWeight(f);
		MyMarks(s, s1);
		OmitMarks(b);
		sc.close();

	}

//if innput/ outputstream is not closed -shows like this Resource leak: 'sc' is never closed
	void MyAge(int age) {
		System.out.println("your age is: " + age);

	}

	void MyName(String fname, String lname) {
		System.out.println("your FullName is: " + fname + " " + lname);
	}

	static void MyPhnNo(long l) {
		System.out.println("your Phone Number iS: " + l);

	}

	static void MyGender(char c) {
		System.out.println("your Gender is: " + c);
	}

	static void MyHeight(double h) {
		System.out.println("your Height is: " + h);
	}

	static void MyWeight(float w) {
		System.out.println("your weight is: " + w);
	}

	static void MyMarks(short total, short obtain) {
		System.out.println("total Marks: " + total);
		System.out.println("Obtained Marks: " + obtain);
	}

	static void OmitMarks(byte omit) {
		System.out.println("marks you missed: " + (byte)omit);
	}
}
//Enter your FirstName: 
//jamula krishna
//Enter your LastName: 
//My FullName is: jamula krishna