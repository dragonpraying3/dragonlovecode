/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addnumbers;

import java.util.Scanner;
public class substractNumber {
    //MEMBER VARIABLE DECLARATIONS (declare the variable will be used in whole program)
    public static void main(String[] args){ //method parameters
        System.out.println("This is subtracting!");
        Scanner input=new Scanner(System.in);
    
        System.out.print("Enter first number:");
        int num1=input.nextInt(); //LOCAL VARIABLE DECLARATIONS (variable can only used under the same method)
    
        System.out.print("Enter second number:");
        int num2=input.nextInt();
    
        int different=num1-num2;
    
        System.out.println("The different is :"+different);
    
        input.close();
    }
}
//if use the same name in member&local variable will get error (make sure no same name)
//cannot use java keyword as variable
