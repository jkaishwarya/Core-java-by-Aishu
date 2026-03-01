package com.javaintro;

public class Movie {
	// intialising static variables
	static int theatreId = 111;
	static String theatreName = "Aishwarya";
	// intialising instance variables
	int ticketprice = 350;
	String moviename;

	void main() {
		System.out.println("main method started");
		System.out.println("*****************************");
		System.out.println("**watch movies on cinema club**");
		// creation of object1
		System.out.println("---------object1------------");
		// intialising static variables
		theatreId = 1605;
		theatreName = "Cinemaclub";
		// Accessing static variables
		System.out.println("TheatreId:" + theatreId);
		System.out.println("TheatreName:" + theatreName);
		Movie m1 = new Movie();
		// intialising instance variable
		m1.ticketprice = 250;
		m1.moviename = "Rajsaab";
		System.out.println("Ticket Price:" + m1.ticketprice);
		System.out.println("Movie Name:" + m1.moviename);
		// Creation of object2
		System.out.println("---------object2------------");
		Movie m2 = new Movie();
		m2.ticketprice = 200;
		m2.moviename = "Mana Shankara varaprasad Garu";
		System.out.println("TheatreId:" + theatreId);
		System.out.println("TheatreName:" + theatreName);
		System.out.println("Ticket Price:" + m2.ticketprice);
		System.out.println("Movie Name:" + m2.moviename);
		// object3
		System.out.println("---------object3------------");
		Movie m3 = new Movie();
		m3.ticketprice = 300;
		m3.moviename = "Ananaganaga Oka Raju";
		System.out.println("TheatreId:" + theatreId);
		System.out.println("TheatreName:" + theatreName);
		System.out.println("Ticket Price:" + m3.ticketprice);
		System.out.println("Movie Name:" + m3.moviename);
		// main method ended
		System.out.println("*****************************");
		System.out.println("main method ended");
		System.out.println("---------object4------------");
		Movie m4 = new Movie();
		theatreId = 1001;
		theatreName = "indieclub";
//		m4.ticketprice = 400;
//		m4.moviename = "Sirai";
//	recent upadated static values taken by jvm
		System.out.println("TheatreId:" + theatreId);//-->1001
		System.out.println("TheatreName:" + theatreName);//-->Sirai
		System.out.println("Ticket Price:" + m4.ticketprice);
		System.out.println("Movie Name:" + m4.moviename);
		// main method ended
		System.out.println("*****************************");
		System.out.println("main method ended");

	}

}
