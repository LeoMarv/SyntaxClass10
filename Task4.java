package com.syntax.class10;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inp=new Scanner(System.in);
		System.out.println("Print how many values you would like to store");
		int num=inp.nextInt();
		double sum=0;
		double [] values=new double[num];
		for(int i=0; i<values.length; i++) {
			System.out.println("Please enter the values");
			values[i]=inp.nextInt();
			sum+=values[i];
		}
		
			System.out.println(sum);
		
	
		
	
		
		
		
		
	}

}
