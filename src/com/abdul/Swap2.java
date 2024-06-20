package com.abdul;

public class Swap2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        String name = "kunall";
        greet(name);
        System.out.println(name);


    }
    static void greet(String name){
      name = "abdul";
        System.out.println(name);

    }
    static void swap(int num1, int num2){
        int temp = num1;
        num1=num2;
        temp=num2;// this change valid in the function loop only
    }
}
