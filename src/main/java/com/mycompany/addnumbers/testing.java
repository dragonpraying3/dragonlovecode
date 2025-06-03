/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addnumbers;
import java.util.Scanner;

//public class testing {
//    public static void main(String[] args){
//        Scanner input=new Scanner(System.in);
//        System.out.print("Name: ");
//        String name=input.nextLine();
//        System.out.println("Your name:"+name);
//        
//        input.close();
//    }
//}

//while statement
//public class testing{
//    public static void main(String[] args) {
//        int count=0;
//        while (count<10){
//            System.out.println(count);
//            count++;
//        }
//    }
//}

//if statement
//public class testing{
//    public static void main(String[] args) {
//        final double max_wages =57600;
//        final double tax_rate=0.124;
//        double wages,tax;
//        
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter your wages :RM");
//        wages=sc.nextInt();
//        
//        if (wages<=57600){
//            tax=tax_rate*wages;
//        }else{
//            tax=tax_rate*max_wages;
//        }
//        
//        System.out.printf("Your tax is RM%.2f",tax);
//    }
//}

//if,else if ,else statement
//public class testing{
//    public static void main(String[] args) {
//        int testScore;
//        char grade;
//        
//        Scanner sc=new Scanner(System.in);
//        System.out.println("GRADE CHECKING");
//        System.out.print("Enter your marks: ");
//        testScore=sc.nextInt();
//        
//        if (testScore>=70){
//            grade='A';
//        }else if (testScore>=60){
//            grade='B';
//        }else if (testScore>=50){
//            grade='C';
//        }else if (testScore>=40){
//            grade='D';
//        }else{
//            grade='E';
//        }
//        
//        System.out.printf("Your grade is %c",grade);
//    }
//}

//nested if statement
//public class testing{
//    public static void main(String[] args) {
//        int age=33;
//        
//        if (age<18){
//            System.out.println("You are a minor");
//        }else{
//            if (age<65){
//                System.out.println("You are an adult");
//            }else{
//                System.out.println("You are a senior");
//            }
//        }
//    }
//}

//switch statement
//public class testing{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number of month: ");
//        int month=sc.nextInt();
//        String name = null;
//        
//        switch (month){
//            case 1:
//                name="January";
//                break;
//            case 2:
//                name="February";
//                break;
//            case 3:
//                name="March";
//                break;
//            case 4:
//                name="April";
//                break;
//            case 5:
//                name="May";
//                break;
//            case 6:
//                name="June";
//                break;
//            case 7:
//                name="July";
//                break;
//            case 8:
//                name="August";
//                break;
//            case 9:
//                name="September";
//                break;
//            case 10:
//                name="October";
//                break;
//            case 11:
//                name="November";
//                break;
//            case 12:
//                name="December";
//                break;
//            default:
//                System.out.println("Bro are you sure this is a valid month?");
//        }
//        System.out.println("The month is "+name);
//    }
//}

//Quick review 1
public class testing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("please enter age shabi: ");
        int ageOfEntrant=sc.nextInt();
        double entryFee;
        
        if (ageOfEntrant <5){
            entryFee=0.00;
        }else if (ageOfEntrant >=65){
            entryFee=1.50;
        }else{
            entryFee=2.50;
        }
        System.out.printf("Your entry fee are $ %.2f",entryFee);
    }
}