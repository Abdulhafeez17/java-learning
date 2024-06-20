package com.abdul;

public class Shadow {
    static int x=45; // this will be shadowwd at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x ;// the class variable at the line 4 is shadowed by this
     //  System.out.println(x); //-> scope will begin when the value is initialized
        x=48;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
        return;
    }
}
