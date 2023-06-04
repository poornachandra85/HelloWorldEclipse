package com.itbulls.poorna.javacore.primitives;

public class PrimitiveTypes {

	public static void main(String[] args) {
		byte b=1;
		short s;
		s=2;
		int i=3;
		long l=4;
		
		char c='a';
		
		boolean bool=true;
		
		float f = 1.2F;
		
		long lg=200000000L;
		
		double d=1.2;
		
		float fl=3.4F;
		
		var v=1;
//		v=true;
//		v=1.3;
		
		int l3=s;
		
		char c2=100;
		System.out.println(c2);
		// output is "d"
		
		double d2=l3;
		d2=l;
		
		b=(byte)l3;
		
		byte b2 =(byte)128;
		System.out.println(b2); // output -128 byte range -128 to 127
		
		long number = 499_999_9999_001L;
		System.out.println(number);
		double converted = (double) number;
		System.out.println(converted);
		System.out.println(number - (long) converted); // output 0
		
		
		
	}

}
