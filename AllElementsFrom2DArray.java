package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2D array is array of arrays
		//1st For loop is for rows
             String[][] groceries= {
				
				{"Banana","Apple","Mango"},
				{"Potato","Tomato"},
				{"Milk","Cheese","Ayran", "Yogurt"}
				
				
				
				
		};
   //type of value = string  //Array name = groceries
		for(String[]grocery:groceries) {
		
		    for(String g:grocery) {
		System.out.println(g);
		
		    }
		System.out.println();
		}
	}

}
