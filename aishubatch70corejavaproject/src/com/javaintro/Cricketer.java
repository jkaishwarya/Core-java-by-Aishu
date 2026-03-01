package com.javaintro;

public class Cricketer {
	static int countryID;
	static String countryName;

	int jerseyNo;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("Welcome to india cricket team");
		System.out.println("*****object1 info******");
		countryID = 24;
		countryName = "India";
		Cricketer jk = new Cricketer();
		jk.jerseyNo = 18;
		jk.cricketerName = "Dhoni";
		System.out.println("CountryId:" + countryID);
		System.out.println("CountryName:" + countryName);
		System.out.println("jerseyNo:"+ jk.jerseyNo);
		System.out.println("CricketerName :"+ jk.cricketerName);
		System.out.println("******object2 info******");
		Cricketer ngr = new Cricketer();
		ngr.jerseyNo = 21;
		ngr.cricketerName = "virat";
		System.out.println("CountryId:" + countryID);
		System.out.println("CountryName:" + countryName);
		System.out.println("jerseyNo:"+ ngr.jerseyNo);
		System.out.println("CricketerName :"+ ngr.cricketerName);
		
	}

}
