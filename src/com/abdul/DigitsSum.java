package com.abdul;

public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(sum12(1342));
    }
    static int sum12(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sum12(n/10);
    }
}
