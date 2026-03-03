//3️⃣ Student Result Processing System
//📌 Scenario:Calculate total, average and grade.
//👉 Requirements:int calculateTotal(int m1, int m2, int m3, int m4, int m5), double calculateAverage(int total),String findGrade(double average)
//👉 Grade Logic:90+ → A ,–89 → B,–74 → C,Below 60 → Fail
//✔ Each method must return value
//✔ Print result summary

package com.javaLanguageFundamentals.Methods;

import java.util.Scanner;

public class VthReVthArgCalMarks {

	int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
		int total = (m1 + m2 + m3 + m4 + m5);
		System.out.println("Total Marks: " + total);
		return total;

	}

	double calculateAverage(int total) {
		double Average = (total / (5.0));
		System.out.println("Average of Marks: " + Average);
		return Average;
	}

	String findGrade(double average) {
		if (average >= 90) {
			return "A";
		} else if (average >= 75) {
			return "B";
		} else if (average >= 60) {
			return "C";
		} else {
			return "Fail";
		}

	}

	public static void main(String[] args) {
		VthReVthArgCalMarks v = new VthReVthArgCalMarks();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks of Student: " + " ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		int total = v.calculateTotal(m1, m2, m3, m4, m5);
		double average = v.calculateAverage(total);
		System.out.println("grade:" + v.findGrade(average));
		sc.close();
	}

}
//Enter Marks of Student: 95 92 90 98 96
//Total Marks: 471
//Average of Marks: 94.2
//grade:A

//Enter Marks of Student: 35 32 33 64 56
//Total Marks: 220
//Average of Marks: 44.0
//grade:Fail

//Enter Marks of Student: 60 76 84 75 88
//Total Marks: 383
//Average of Marks: 76.6
//grade:B
//Enter Marks of Student: 60 65 72 68 62
//Total Marks: 327
//Average of Marks: 65.4
//grade:C