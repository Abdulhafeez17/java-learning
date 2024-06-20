package com.abdul;

import java.util.Scanner;

public class Functionsting {
    public static void main(String[] args) {
      // String message  =  greet();
//        System.out.println(message);

        String Personalized = myGreet("abdul");
        System.out.println(Personalized);
    }
    static String myGreet(String name){
        String person = "my name" + name ;
        return person;
    }
//    static String greet(){
//
//        String greeting = "hey are alive";
//        return greeting;
//    }
}
