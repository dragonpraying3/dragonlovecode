package com.mycompany.addnumbers;

import java.util.Scanner; //Step 1:Import Scanner class
public class AddNumbers{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in); //Step 2: Create Scanner object
                System.out.println("This is addiction!");

		//Step 3: Ask for first number
		System.out.print("Enter the first number:");
		int num1=input.nextInt();
		
		//Step 4 : Ask for second number
		System.out.print("Enter the second number:");
		int num2 = input.nextInt();
		
		//Step 5:Calculate the sum
		int sum=num1+num2;

		//Step 6:Display the sum
		System.out.println("The sum is "+sum);

		input.close(); //Step 7:Close the scanner
	}
}
