package com.itbulls.poorna.javacore.methods.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the numbers with space:");
		String numbers=sc.nextLine();
		int[] intArray=ConvertArrayStringToIntegerArray(numbers.split("\\s+"));
		
		int maxNum=maxInt(intArray);
		System.out.println(maxNum);
		
		
		
	}

	private static int maxInt(int[] intArray) {
		int max=intArray[0];
		for (int i : intArray) {
			if (i>max) {
				max=i;
			}
		}
		return max;
	}

	private static int[] ConvertArrayStringToIntegerArray(String[] Stringarray) {
		int[] intArray=new int[Stringarray.length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=Integer.valueOf(Stringarray[i]);
		}
		return intArray;
	}
	
	// ====================== SOLUTION WITH STREAM API
	
		public static int findMaxIntInArrayStreamApi(int[] intArray) {
			return Arrays.stream(intArray).max().getAsInt();
		}

		private static int[] convertStringArrayToIntArrayStreamApi(String[] stringArray) {
			return Arrays.stream(stringArray)
					.mapToInt(s -> Integer.valueOf(s))
					.toArray();
		}

	
	
	

}
