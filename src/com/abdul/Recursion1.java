package com.abdul;

public class Recursion1 {
    public static void main(String[] args) {
//        message();
//    }
//    static void message(){
//        System.out.println("hello world0");
//        message1();
//    }
//    static void message1() {
//        System.out.println("hello world1");
//        message2();
//    }
//    static void message2() {
//        System.out.println("hello world2");
//        message3();
//    }
//    static void message3() {
//        System.out.println("hello world3");


        // write a function that takes in a number and prints it
        // print first 5 number "1 2 3 4 5
        print1(1);
//        print1(2);
//        print1(3);
//        print1(4);
//        print1(5);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n) {
        System.out.println(n);

    }
}
