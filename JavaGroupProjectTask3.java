package com.syntax.class10;

public class JavaGroupProjectTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//#3 Create a 2D array of integers. 
		//Develop a program which will calculate the sum of  even and odd numbers for that array.
		
		//#4 Create an array on double values using scanner 
		//and calculate the sum of all stored elements in that array.
		
		
		int [][] nums= {
				
				{11,22,33,44},
				{55,66,77,88}
						
		};
	    
	
		int a[]= nums[0];
	    int j[]= nums[1];
	    for (int i=0;i<4;i++) {
	    	if(a[i]%2==0) {	
	    	System.out.println(j[i]+" "+a[i]+" +  = "+(a[i]+j[i]));
	    	}else if (a[i]%2!=0) {
	    		System.out.println(j[i]+" "+a[i]+" +  = "+(a[i]+j[i]));
	    	}
	    }

		
		
		
		
	}

}
