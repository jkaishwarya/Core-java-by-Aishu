package com.javaDailyAssignments;

public class CountNoOfObjects0303 {

	static int i = 0;

	CountNoOfObjects0303() {
		i = i + 1;

	}
//instance blocks runs every time an object is created, before the constructor.
//so we did prgm count no.of objects without instance blocks
//	{
//		System.out.println("instance block executed when object calls");
//	}

	public static void main(String[] args) {
		CountNoOfObjects0303 x = new CountNoOfObjects0303();
		CountNoOfObjects0303 y = new CountNoOfObjects0303();
		CountNoOfObjects0303 z = new CountNoOfObjects0303();
		CountNoOfObjects0303 p = new CountNoOfObjects0303();
		System.out.println("No.of objects created: " + i);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);

	}

}//(--------------------------------------or--------------------------------------------------)
//professional answer- Oops and Encapsulation
//package com.javaDailyAssignments;
//
//public class CountNoOfObjects0303 {
//
//    // Private static variable (shared by all objects)
//    private static int count = 0;
//
//    // Constructor
//    CountNoOfObjects0303() {
//        count++;   // Increment when object is created
//    }
//
//    // Public static getter method
//    public static int getCount() {
//        return count;
//    }
//
//    public static void main(String[] args) {
//
//        CountNoOfObjects0303 x = new CountNoOfObjects0303();
//        CountNoOfObjects0303 y = new CountNoOfObjects0303();
//        CountNoOfObjects0303 z = new CountNoOfObjects0303();
//        CountNoOfObjects0303 p = new CountNoOfObjects0303();
//
//        // Calling using class name (best practice)
//        System.out.println("No.of objects created: " + CountNoOfObjects0303.getCount());
//    }
//}
//Why is getCount() static?
//Answer:Because count is static and belongs to the class, so it should be accessed using class name.
///*************************Using Static Method to Display Count (Better Design)************************************
//Instead of accessing i directly from main, you can:
//Make i private
//Provide a static getter method
//Why?
//Because of Encapsulation (OOP principle).
//Concept:
//private static int count
//Increment in constructor
//Create public static int getCount() method.
//Call it using class name
//👉 This is more professional.