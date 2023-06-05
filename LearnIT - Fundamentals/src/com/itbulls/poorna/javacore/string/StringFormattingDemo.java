package com.itbulls.poorna.javacore.string;

public class StringFormattingDemo {

	public static void main(String[] args) {
		
		String firstname="Poorna";
		
		String greetingsTemplate="Hello, dear %s! Good %s!";
		
		String morning="Morning";
		String afternoon="Afternoon";
		String evening="Evening";
		
		String formattedString=String.format(greetingsTemplate, firstname,morning);
		
		System.out.println(formattedString); //Hello, dear Poorna! Good Morning!
		
		System.out.printf("You have %d computers available at store\n", 10);
		
	}

}
