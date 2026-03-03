package com.javaDailyAssignments;

public class CountNoOfObjects0303VthFactoryMethod {
	static int count = 0;

	public static void main(String[] args) {
		CountNoOfObjects0303VthFactoryMethod c = GetCount();
		CountNoOfObjects0303VthFactoryMethod c1 = GetCount();
		CountNoOfObjects0303VthFactoryMethod c3 = new CountNoOfObjects0303VthFactoryMethod();
		System.out.println("no of objects =" + CountNoOfObjects0303VthFactoryMethod.count);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c3);

	}

	CountNoOfObjects0303VthFactoryMethod() {
		count++;
	}

	static CountNoOfObjects0303VthFactoryMethod GetCount() {
		CountNoOfObjects0303VthFactoryMethod c = new CountNoOfObjects0303VthFactoryMethod();
		return c;
	}

}
//(-------------------------------------or--------------------------------------------------)
//✔ YES — it works.
//✔ It counts objects.
//✔ It does not use instance block.

//If you run:
//CountNoOfObjects0303VthFactoryMethod c = GetCount();
//CountNoOfObjects0303VthFactoryMethod c1 = GetCount();
//Output will be:
//no of objects = 2
//So logically ✔ correct.

//⚠ But Is This a Proper Factory Method Design?
//Not fully.
//Why? 👇
//Right now your constructor is still accessible:
//new CountNoOfObjects0303VthFactoryMethod();

//Someone can create object like this:
//CountNoOfObjects0303VthFactoryMethod obj = new CountNoOfObjects0303VthFactoryMethod();
//If they do that:
//count will NOT increase
//Because increment happens only inside GetCount()
//So your counting logic can break.

//🎯 What Is Missing?
//In a proper factory method pattern:
//✔ Constructor should be private
//✔ Object creation must happen only through factory method

//🔥 Correct Professional Factory Version
//package com.javaDailyAssignments;
//
//public class CountNoOfObjects0303VthFactoryMethod {
//
//    private static int count = 0;
//
//    // Private constructor
//    private CountNoOfObjects0303VthFactoryMethod() {
//    }
//
//    // Factory method
//    public static CountNoOfObjects0303VthFactoryMethod getInstance() {
//        count++;
//        return new CountNoOfObjects0303VthFactoryMethod();
//    }
//
//    public static int getCount() {
//        return count;
//    }
//
//    public static void main(String[] args) {
//
//        CountNoOfObjects0303VthFactoryMethod c1 =
//                CountNoOfObjects0303VthFactoryMethod.getInstance();
//
//        CountNoOfObjects0303VthFactoryMethod c2 =
//                CountNoOfObjects0303VthFactoryMethod.getInstance();
//
//        System.out.println("No of objects = " +
//                CountNoOfObjects0303VthFactoryMethod.getCount());
//    }
//}

//🧠 Why This Is Better?
//✅ Constructor is private
//No one can bypass factory method.
//✅ All object creation goes through getInstance()
//So counting is always accurate.

//🔍 Interview Level Understanding
//Basic answer → static variable + constructor
//Advanced answer → private constructor + factory method
//Since you are preparing daily assignments seriously, this is good progress 👏
