package com.javaintro;
//#11 JVM Arch-06

public class TestDemo4 {

	public static void show() {
		System.out.println("show methodcalled");
		System.out.println(Thread.currentThread());
		System.out.println("*********************************");
		TestDemo4 t=new TestDemo4();
		t.main();
		System.out.println("*********************************");
		t.hello();
		

	}

	public static void main(String[] args) {
		System.out.println("main method started");	
		System.out.println(Thread.currentThread());
		System.out.println("*********************************");
		show();
		System.out.println("*********************************");
		TestDemo4 a1 = new TestDemo4();
		a1.hello();
		System.out.println("*********************************");
		System.out.println("main method ended");
		
	}
	void main() {
		System.out.println("instance main block called");
		System.out.println(Thread.currentThread());
	}
	public void hello() {
		System.out.println("hello method called");
		System.out.println(Thread.currentThread());
	}

}
