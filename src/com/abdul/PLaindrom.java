package com.abdul;

public class PLaindrom {

        static int reverse2(int n){
        //sometims u may need afditonal variable in the argument
        //int that case make another function
        int digit = (int)(Math.log10(n)) +1;
        return helper(n,digit);
    }
    private static int helper(int n,int digit){
        if(n%10==n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digit-1)) + helper(n/10,digit-1);
    }


    static boolean palindrom(int n){
        return  n == reverse2(n);
    }

    public static void main(String[] args) {
        System.out.println(palindrom(5665));
    }
}
