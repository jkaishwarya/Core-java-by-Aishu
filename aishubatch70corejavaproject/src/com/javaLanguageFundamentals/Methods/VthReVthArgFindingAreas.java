package com.javaLanguageFundamentals.Methods;

import java.util.Scanner;

//Area of Triangle:- 0.5*base*height
//Area of Square:-Side*Side
//Area of circle:-Pi*radius*radius
//Area of Rectangle:-length*breadth

public class VthReVthArgFindingAreas {

	public static void main(String[] args) {
		System.out.println("------FindingAreas------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base of triangle:");
		double b = sc.nextDouble();
		System.out.print("Enter height of triangle:");
		double h = sc.nextDouble();
		double ArTri = AreaOfTriangle(b, h);
		
		System.out.println("-----------------------------------");
		System.out.print("Enter side of: ");
		float s = sc.nextFloat();
		
		System.out.println("------------------------------------");
		System.out.print("Enter length of rectangle:");
		int l = sc.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		int br = sc.nextInt();
		
		System.out.println("------------------------------------");
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		System.out.println("-------------------Areas--------------");
		System.out.println("Area of Triangle is: " + ArTri+"sqrcm");
		System.out.println("Area of Square     :  " + AreaOfSquare(s)+"sqrcm");
		System.out.println("Area of Rectangle  : " + AreaOfRectangle(l, br)+"sqrcm");
		System.out.println("Area Of Circle     : " + AreaOfCircle(radius)+"sqrcm");
		sc.close();

	}

	static double AreaOfTriangle(double base, double height) {
		double AreaofTriangle = 0.5 * base * height;
		return AreaofTriangle;
	}

	static float AreaOfSquare(float side) {
		return side * side;
	}

	static int AreaOfRectangle(int length, int breadth) {
		int ArRect = length * breadth;
		return ArRect;
	}

	static double AreaOfCircle(double radius) {
		// double ArCir=(Math.PI*radius*radius);//Math.PI not work short
		return (Math.PI * radius * radius);
	}

}