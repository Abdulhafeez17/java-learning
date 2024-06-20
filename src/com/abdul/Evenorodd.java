package com.abdul;

public class Evenorodd {
    public static void main(String[] args) {
        int n = 65;
        System.out.println(isodd(n));
    }
    private static boolean isodd(int n){
        return (n & 1) == 1;

    }
}
