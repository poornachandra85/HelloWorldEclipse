package com.itbulls.poorna.javacore.enumerations.hw;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please, enter  "
				+ "message type. ");
		
		while(true) {
			String userInput=sc.nextLine();
		if(userInputisValid(userInput)) {
			System.out.println(MessagePriority.valueOf(userInput.toUpperCase()).getPriority());
			break;
		}else {
			System.out.println("Please, enter valid "
					+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
			continue;
		}
		
		}
	}

	private static boolean userInputisValid(String userInput) {
		return userInput.equalsIgnoreCase("a") || userInput.equalsIgnoreCase("b")
				|| userInput.equalsIgnoreCase("c")
				|| userInput.equalsIgnoreCase("d");
	}

}
