package com.syntax.class10;

public class TwoDArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//let's create a 2D array of groceries
		
		String[][] groceries= {
				
				{"Banana","Apple","Mango"},
				{"Potato","Tomato"},
				{"Milk","Cheese","Ayran", "Yogurt"}
				
				
				
				
		};

		System.out.println(groceries.length); //# of arrays
		System.out.println(groceries[2][3]); //Yogurt
	
	     //I want to find how many elements my 1 array has
		
		System.out.println("# of elements inside array with index 0 = "+groceries[0].length);
	
		System.out.println("# of elements inside array with index 1 = "+groceries[1].length);
		
		System.out.println("# of elements inside array with index 2 = "+groceries[2].length);
		
		//How do we get all elements from my 2D array?
		
		int total=0;
		
		for(int i=0; i<groceries.length; i++) {   //iterates over arrays/rows
			
			for(int j=0 ; j<groceries[i].length; j++) {  //iterates over elements of each single array/columns
				
				System.out.print(groceries[i][j]+" ");
			    total++;
			}
			
			System.out.println();
		}
		System.out.println("# of elements inside 2D array is = "+total);
		System.out.println("****************************************************");
		
		
		
	}

}
