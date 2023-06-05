package com.itbulls.poorna.javacore.misc;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r.nextInt()); //  any random
		System.out.println(r.nextInt(100)); //0 - 99
		System.out.println(r.nextInt(100)+1); // 0- 100
	}

}
