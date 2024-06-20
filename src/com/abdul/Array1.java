package com.abdul;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
         //int [] arr = new int[5];
         int [] num ={1,5,3,4};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] num){
        num[0]=99;
    }
}
// int s[]
// int [] num ={1,2,3,4}
// int [] array namee  =new int[5];

