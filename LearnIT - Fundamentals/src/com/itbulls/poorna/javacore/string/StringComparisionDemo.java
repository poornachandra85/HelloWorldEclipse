package com.itbulls.poorna.javacore.string;

public class StringComparisionDemo {

	public static void main(String[] args) {
		String s=" hello ";
		String s2=" hello ";
		
		System.out.println("S == S2 :"+ (s==s2)); // true
		
		String s3=new String(" hello ");
		System.out.println("s == s3 :"+ (s==s3)); // false becoz s is in String pool and s3 is in HEAP memory
		System.out.println("s.equals(s3) :"+ s.equals(s3)); // true
		System.out.println("s == s3.intern() :"+ (s==s3.intern())); //true
		
		String name="Poorna";
		String name2="poorna";
		System.out.println("name.equals(name2) :"+name.equals(name2)); //false
		System.out.println("name.equalsIgnoreCase(name2) :"+name.equalsIgnoreCase(name2)); //true
		
		
	}

}
