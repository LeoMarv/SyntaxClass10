package com.syntax.class10;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] numbers= {10.55,07.99,11.88,22.66};
		
		System.out.println(numbers.length);
		System.out.println("*******************************");
		// from 1st to last element
		for (int i=0;i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("******************************");
		
		// from last to 1st element
		for(int i=numbers.length-1; i>=0; i--) {
			System.out.println(numbers[i]);
		}
		// we cannot use enhanced for loop to travel back in an array
		// for each loops always loops 1 direction: start -> end
	}

}
