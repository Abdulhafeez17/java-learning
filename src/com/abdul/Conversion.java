package com.abdul;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float h = input.nextInt();//to convert it into int
//        float f = input.nextFloat();//to print float
//        System.out.println(h);
        // typecasting
//         int a = (int)(6545.55f);// converting float to int
//        System.out.println(a);
        // autometic type promotiion in expression
//        int a =25;
//        byte b =(byte)(a);
//        System.out.println(b);

//     byte a = 40;
//     byte b = 50;
//     byte c = 100;
//     int d = a * b / c ; // when ever the byte evaluation is taking place it will convert into the integer
//        System.out.println(d);
//
//        byte a = 45;
//        a= a * 2; //  it thrw an error

//        System.out.println(3*545.6464f); // will give a float only
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f =5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s); // all the  smallervalues are converte to bigger one
        // b convert to f and the 1st expression is calculated in float the  c convet to i answer will bw in i then  s convert to d
        //float * int -double = double
        System.out.println(result);
    }
}
