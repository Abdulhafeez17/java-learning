package com.abdul;

public class Funtionoverloading {
    public static void main(String[] args) {


        //fun(5);
    fun("kunal");
    int ans =sum(1,52,5);
        System.out.println(ans);
    // at compile time it decide which function to run
}
static int sum(int a,int b){
        return a+b;
}

    static int sum(int a,int b,int c){
        return a+b+c;

    }
    static void fun(int a){
        System.out.println("print the integer");
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println("print the sting");
        System.out.println(name);
    }
}
