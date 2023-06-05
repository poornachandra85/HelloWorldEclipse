package com.itbulls.poorna.javacore.methods;

public class RecursiveMethods {
	
	public static void main(String[] args) {
//		callTheSameMethod();
		System.out.println("Factorial of 3! "+calculateFactorial(3)); // 3! = 3*2*1 = 6
		System.out.println("IterativeFactorial of 4! "+IterativeFactorial(4));
	}

	private static int IterativeFactorial(int i) {
		int factorial=1;
		if(i<0) {
			return -1;
		}else {
			for (int j = 1; j <= i; j++) {
				factorial*=i;
				
			}
			return factorial;
		}
	}

	private static int calculateFactorial(int i) {
		if(i!=0) {
			return i * calculateFactorial(i-1);
		}else {
			return 1;
		}
		
	}

	private static void callTheSameMethod() {
		callTheSameMethod();
	}

}
