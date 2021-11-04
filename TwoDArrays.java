package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] bigArray=new int[3][3];
		
		// adding elements inside 1st array/1st row
		bigArray[0][0]=10;
		bigArray[0][1]=20;
		bigArray[0][2]=30;
		
		// adding elements inside 2nd array/2nd row
		bigArray[1][0]=1;
		bigArray[1][1]=2;
		bigArray[1][2]=3;
	
		// adding elements inside 2nd array/2nd row
		bigArray[2][0]=100;
		bigArray[2][1]=200;
		bigArray[2][2]=300;
	
	
	    //How to access?
		
		System.out.println(bigArray[2][1]);  //200
	
		//What it shows?
		System.out.println("2D Array Size = "+bigArray.length); 
		//Returns how many 1D arrays it has/# of rows
		
		
		
		
		
		
	}

}
