package com.javaDailyAssignments;

import java.util.Scanner;

public class Onlinefoodorder0203 {

	double calculateItemTotal(double price, int quantity) {
		double Total = price * quantity;
		return Total;
	}

	double addGST(double amount) {// --->GST - 5%
// double GST=((5.0)/100)*amount;//int literal/int literal java take result also int
// so,its give 0 gst for 5/100---> to get double value as result either numerator/denominator should be double
		double GST = ((0.05) * amount);
		double GSTamount = (amount + GST);
		return GSTamount;

	}

	double addDeliveryCharge(double amount) {
		// return amount;
		return amount + 40;

	}

	void printBill(double finalAmount) {
		System.out.println("total final price is: " + finalAmount);
	}

	public static void main(String[] args) {
		Onlinefoodorder0203 t = new Onlinefoodorder0203();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter price of item: ");
		double price = sc.nextDouble();
		System.out.print("Enter Quantity of item: ");
		int quantity = sc.nextInt();
		double Totalamount = t.calculateItemTotal(price, (int) quantity);
		double Gstamount = t.addGST(Totalamount);
		double finalamount = t.addDeliveryCharge(Gstamount);
		t.printBill(finalamount);
//System.out.println(amount);
//t.addGST(Totalamount);
//System.out.println("GST added amount: " + t.addGST(Totalamount));
//System.out.println("Added Deliverychargeof: " + t.addDeliveryCharge(40));
//double FinalAmount = (t.addDeliveryCharge(40) + t.addGST(Totalamount));
//t.printBill(FinalAmount);
		sc.close();

	}

}
//package com.javaDailyAssignments;
//
//import java.util.Scanner;
//
//public class Onlinefoodorder0203 {
//
//    double calculateItemTotal(double price, int quantity) {
//        return price * quantity;
//    }
//
//    double addGST(double amount) {   // 5% GST
//        return amount + (0.05 * amount);
//    }
//
//    double addDeliveryCharge(double amount) {
//        return amount + 40;   // fixed delivery charge
//    }
//
//    void printBill(double finalAmount) {
//        System.out.println("Total final price is: " + finalAmount);
//    }
//
//    public static void main(String[] args) {
//
//        Onlinefoodorder0203 t = new Onlinefoodorder0203();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter price of item: ");
//        double price = sc.nextDouble();
//
//        System.out.print("Enter quantity of item: ");
//        int quantity = sc.nextInt();
//
//        double itemTotal = t.calculateItemTotal(price, quantity);
//        double gstAmount = t.addGST(itemTotal);
//        double finalAmount = t.addDeliveryCharge(gstAmount);
//
//        t.printBill(finalAmount);
//
//        sc.close();
//    }
//}
