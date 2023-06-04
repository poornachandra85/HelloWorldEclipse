package com.itbulls.poorna.javacore.arrays;

public class Arrays {

	public static void main(String[] args) {
		int[] arr;
		int arr2[];
		
		arr=new int[10];
		System.out.println(arr.length);
		System.out.println(arr[0]);
		
		double[] arr3=new double[10];
		System.out.println(arr3[0]);
		
		boolean[] arr4=new boolean[10];
		System.out.println(arr4[0]);
		
//		System.out.println(arr4[10]);
		
		int[] arr5= {3,2,1};
		
		int[][] arr6= {
				{1,2,3},
				{4,5,6}
				
		};
		
		System.out.println(arr6[0][2]);
		
		int[][] matrix=new int[10][10];
		System.out.println(matrix[0]);
		
		System.out.println(java.util.Arrays.toString(arr5));
		java.util.Arrays.sort(arr5);
		System.out.println(java.util.Arrays.toString(arr5));
		
		
	}

}
