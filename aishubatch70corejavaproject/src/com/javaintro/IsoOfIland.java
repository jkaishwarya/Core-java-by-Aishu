package com.javaintro;

class A {
	B b;

	@override
	protected void finalize() throws Throwable {

		System.out.println("finalize method called from  A");
	}
}
class B {
	A a;

	@override
		protected void finalize() throws Throwable {

			System.out.println("finalize method called from B");
		}
	}
		public class IsoOfIland {

	public static void main(String[] args) {
		
		System.out.println("main method strated ");
		 A t1=new A();//obj1 created
		 B t2=new B();//obj2 created
		  
		 t1.b = t2;// by using obj1 reference variable storing object2
		 t2.a = t1;// by using obj2 reference variable storing object1
		 
		 t1=null;
		 t2=null;
		 
		 System.gc();
		 System.out.println("main method ended");
	}
			

}
