/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addnumbers;

//class Cat{
//    String name;
//    int age;
//    String owner;
//    
//    void meow(){ 
//        System.out.println("Meow!");
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        Cat myCat=new Cat();
//        myCat.name="Buddy";
//        myCat.age=3;
//        myCat.owner="Long";
//        myCat.meow(); //output: Meow!
//        System.out.println(myCat.name+myCat.age+myCat.owner);
//    }
//}

class friend{
    String name;
    int age;
    
    void boom(){
        System.out.println("Like you");
    }
}

public class Main{
    public static void main(String[] args) {
        friend myfriend=new friend();
        myfriend.name="Jalil";
        myfriend.age=13;
        myfriend.boom();
        System.out.println(myfriend.name+myfriend.age);
    }
}
