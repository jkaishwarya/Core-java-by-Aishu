package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

public class DataTypesTest3 {
//	BigInteger bi = new BigInteger(); we cannot create object data type 
//	because there is no parameterized constructor 
	BigInteger bi1 = new BigInteger("34634872371216312839712987764821487");// instance varible
	BigInteger bi2 = new BigInteger("237271872817376247329847824783248");//
	BigDecimal bd1 = new BigDecimal(523718723176387387912.372467648123879234);
	BigDecimal bd2 = new BigDecimal(23718723176387387912.2467648123879234);

	public static void main(String[] args) {
		System.out.println("******** main method started *********");
		System.out.println("----------------BigInteger-----------------");
		DataTypesTest3 d = new DataTypesTest3();
		System.out.println("Biginteger1 : " + d.bi1);
		System.out.println("BigInteger2 : " + d.bi2);
		System.out.println("Addition :" + d.bi1.add(d.bi2));
		System.out.println("subtraction :" + d.bi1.subtract(d.bi2));
		System.out.println("Multiplication :" + d.bi1.multiply(d.bi2));
		System.out.println("Division :" + d.bi1.divide(d.bi2));
		System.out.println("maximum value :"+d.bi1.max(d.bi2));
		System.out.println("minimum value :"+d.bi1.min(d.bi2));
		System.out.println("gcd :"+d.bi1.gcd(d.bi2));
		System.out.println("double:"+d.bi1.doubleValue());
		// work on double ,gcd etc....
		System.out.println();
		
		System.out.println("----------------BigDecimal-----------------");
		System.out.println("BigDecimal1 :"+d.bd1);
		System.out.println("BigDecimal2 :"+d.bd2);
		System.out.println("addition :"+d.bd1.add(d.bd2));
		System.out.println("division :"+d.bd2.divide(d.bd2));
		System.out.println("Multiplication :" + d.bd1.multiply(d.bd2));
		System.out.println("Subtraction :" + d.bd1.subtract(d.bd2));
		System.out.println("maximum value :"+d.bd1.max(d.bd2));
		System.out.println("minimum value :"+d.bd1.min(d.bd2));
		System.out.println("double:"+d.bd1.doubleValue());
		
		
		
	}

	

}
