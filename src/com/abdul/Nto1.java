package com.abdul;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
        funrev(6);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }//print 5 4 3 2 1
    static void funrev(int n){
        if(n == 0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }//print 1 2 3 4 5

}
