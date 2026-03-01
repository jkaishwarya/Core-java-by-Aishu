package com.javaintro;
// to load class(#10 JVM Arch-04)

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("main method started");
//		Class.forName("com.javaintro.Movie");
		System.out.println("class found successfully 😊😊");
		Class.forName("com.mysql.cj.jdbc.Driver");
		

	}

}
