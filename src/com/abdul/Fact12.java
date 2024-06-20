package com.abdul;

public class Fact12 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    static int fatorial(int n){
        if(n<=1){
            return 1;

        }
        return n* fatorial(n-1);// we are returning the function call instead off printing the function
    }
}
