/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addnumbers;
import java.util.Scanner;

//q1
//public class testing4 {
//    public static void main(String[] args) {
//        final int max_number=10;
//        int number_bed;
//        System.out.println(max_number+" in a bed and the little one said,");
//        number_bed= max_number-1;
//        
//        while (number_bed>0){
//            System.out.println("\"Roll over, roll over.\"");
//            System.out.println("They all rolled over and one fell out.");
//            System.out.println(number_bed+" in a bed and the little one said, ");
//            number_bed=number_bed-1;
//        }
//        System.out.println("\"Alone at last.\"");
//    }
//}

//q2
//public class testing4{
//    public static void main(String[] args) {
//        double sum=0,num;
//        for (int i=0;i<5;i++){
//            num=Math.random();
//            sum=sum+num;
//        }
//        double average=sum/5;
//        System.out.println("Average: "+average);
//    }
//}

//array1
//public class testing4 {
//    public static void main(String[] args) {
//        int[] counts=new int[5];
//        Scanner sc=new Scanner(System. in);
//        System.out.print("Enter five numbers separate by space :");
//        String number=sc.nextLine();
//        String[] parts=number.split(" ");
//
//        for (int i=0;i<5;i++){
//            counts[i]=Integer.parseInt(parts[i]); //convert each string to int
//        }
//
//        System.out.println(counts[4]+" "+counts[3]+" "+counts[2]+" "+counts[1]+" "+counts[0]);
//    }
//}

//array2
public class testing4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudent=sc.nextInt();
        sc.nextLine();

        String[] names=new String[numberOfStudent];
        double[][] scores=new double[numberOfStudent][2]; //two dimensional array
        double[] average=new double[numberOfStudent];

        for (int i=0;i<numberOfStudent;i++){
            System.out.println("\nEnter student "+(i+1)+":");
            System.out.print("Name: ");
            names[i]=sc.nextLine();

            System.out.print("Score for Exam 1: ");
            scores[i][0]=sc.nextDouble();

            System.out.print("Score for Exam 2: ");
            scores[i][1]=sc.nextDouble();
            sc.nextLine(); //consume newLine

            average[i]=(scores[i][0]+scores[i][1])/2;
        }

        System.out.println("----Student Average----");
        for (int i=0;i<numberOfStudent;i++){
            System.out.printf("%s : %.2f%n",names[i],average[i]); //%n means new line
        }
    }
}