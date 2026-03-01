package com.javaintro;

public class GarColl {
	
	static void nagaraj() {
		System.out.println("-----------------------------");
		System.out.println("nagaraj method called");
		GarColl g11 = new GarColl();
		System.out.println(g11);
		System.out.println("-----------------------------");
	}
	@override
	protected void finalize() throws Throwable{
		System.out.println("finalize method called");
		
	}
	static GarColl g = new GarColl();

	public static void main(String[] args) {
		GarColl g1 = new GarColl();
		GarColl g2 = new GarColl();
		GarColl g3 = new GarColl();
//		
//		  System.out.println("main method started"); 
//		  System.out.println(g1);// @1dbd16a6 
//		  System.out.println(g2);// @7ad041f3 
//		  System.out.println(g3);// @251a69d7  
//		  System.out.println(g); //@7344699f
//		  System.out.println("-----------------------------");

		g2 = null;// 1)nullifing object

		g3 = g1;// 2)re-assign object
		
		new GarColl();//anonymous object
		
		nagaraj();//method inside object
		 
		

		System.out.println(g1);// @1dbd16a6
		System.out.println(g2);// null
		System.out.println(g3);// @7ad041f3---> after reassign
		System.out.println(g);// @251a69d7
		System.out.println("-----------------------------");
		
		System.gc();
	}

}
