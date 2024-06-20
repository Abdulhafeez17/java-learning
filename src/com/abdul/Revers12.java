package com.abdul;

public class Revers12 {
//
//    static int sum;
//    static void reverse(int n){
//
//
//        if(n==0){
//            return;
//        }
//        int rem=n%10;
//        sum=sum*10+rem;
//        reverse(n/10);
//    }

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

    public static void main(String[] args) {
//         reverse(5465);
//        System.out.println(sum);
        System.out.println(reverse2(5789));
    }


}
