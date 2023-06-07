package com.itbulls.poorna.javacore.enumerations;

public class EnumDemo {

	public static void main(String[] args) {
		Priority priority = Priority.High;

		switch (priority) {
		case High:
			System.out.println("The statement is on high");
			break;
		case Medium:
			System.out.println("The statement is on medium");
			break;
		case Low:
			System.out.println("The statement is on Low");
			break;
		}
		
		
		Priority priority2=Priority.valueOf("High");
		System.out.println(priority2);                      // High
		
	//	Priority priority3=Priority.valueOf("high");
	//	System.out.println(priority3); 					//Exception in thread "main" java.lang.IllegalArgumentException: No enum constant com.itbulls.poorna.javacore.enumerations.Priority.high
		
		System.out.println("======= Enum Comparision================");
		
		System.out.println("priority==Priority.Medium:  "+(priority==Priority.Medium));
		
		System.out.println("priority==Priority.High:  "+(priority==Priority.High));
		
		System.out.println("============ Enum ordinal()================");
		
		System.out.println("Priority.Medium.ordinal():  "+(Priority.Medium.ordinal()));
		
		System.out.println("Priority.High.ordinal():  "+(Priority.High.ordinal()));
		
		System.out.println("============ Enum iteration=====================");
		
		Priority[] priorValues=Priority.values();
		
		for (Priority priority3 : priorValues) {
			System.out.println(priority3);
		}
		
		System.out.println("============ Enum fields and methods===================");
		
		System.out.println("Month.JANUARY.getDaysAmount():   "+Month.JANUARY.getDaysAmount());
		
	}

}
