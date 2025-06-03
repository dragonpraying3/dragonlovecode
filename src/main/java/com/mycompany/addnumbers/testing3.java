/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addnumbers;
import java.util.Scanner;

//lab 2 C1
//public class testing3 {
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Your gender");
//        String gender=sc.next();
//        System.out.println("Your gender is "+gender);
//    }
//}

////lab 2 D1
//public class testing3{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("The first number is ");
//        int num1=sc.nextInt();
//        
//        System.out.print("The second number is ");
//        int num2=sc.nextInt();
//        
//        float average=(num1+num2)/2f;
//        System.out.printf("The average of %d and %d is "+average,num1,num2);
//    }
//}

//lab 2 D2
//public class testing3{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        
//        System.out.print("The maximum of the queue: ");
//        int high=sc.nextInt();
//        
//        for (int i=0;i<high+1;i++){
//            System.out.println(i);
//        }
//    }
//}

//lab 2 D3
//public class testing3{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        
//        System.out.println("Convertion of SECOND into HOUR");
//        System.out.print("Second: ");
//        int second=sc.nextInt();
//        float hour=(float)second/60/60;
//        System.out.printf("%d seconds is equivalent to %.2f hours",second,hour);
//    }
//}

//lab 2 D4
//public class testing3{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("The circle with a radius of ");
//        int radius=sc.nextInt();
//        
//        float pi=3.142f;
//        float circumference=2*pi*radius;
//        float area=pi*(radius*radius);
//        
//        System.out.printf("Circumference = %.2f\n",circumference);
//        System.out.printf("Area = %.2f\n",area);
//    }
//}

//lab 2 D5
public class testing3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ODD/EVEN NUMBER?");
        System.out.print("Number: ");
        int number=sc.nextInt();
        
        if (number%2==0){
            System.out.printf("%d is an even number",number);
        }else{
            System.out.printf("%d is an odd number",number);
        }
    }
}
