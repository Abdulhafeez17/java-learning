package com.abdul;

public class Scooping {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        String name = "kunal";
        {
            //int a =5;// it will give error bcozit already initialized->
            a=54; // we can change like this here we are not creating
            System.out.println(a);
            // value initialized in this block will remain in this block only
            name = "abdul";
            System.out.println(name);
        }
      //  System.out.println(c);// cannot use outside the block
    }
    static void random(int marks){
        int num=54;
        System.out.println(num);
        System.out.println(marks);
    }
}
