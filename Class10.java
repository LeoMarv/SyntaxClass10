package com.syntax.class10;

public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] drinks=new String[4];
		drinks[0]="Water";
		drinks[1]="Tea";
		drinks[2]="Coke";
		drinks[3]="Pepsi";
		
		int size=drinks.length;
		System.out.println(size);
		
		System.out.println(drinks[2]);
		System.out.println("**************************************************");
		
		for(String drink:drinks) {
			
			System.out.println(drink);
		}
		System.out.println("*************************************************");
		
		for(int i=0; i<drinks.length; i++) {
			System.out.println(drinks[i]);
		
		}
		
		
		
		
		
		
	}

}
