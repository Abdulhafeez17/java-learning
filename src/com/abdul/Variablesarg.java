package com.abdul;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Variablesarg {
    public static void main(String[] args) {
       fun(1,2,3,1,6,5);
//        multiple(1,2,"her","efe","efe");
        //fun() -> an empty calll will thro an error this is called as ambiguity bcoz we are not providing sny kind  of data
    }
//    static void multiple(int a,int b,String ...v){
//        System.out.println(Arrays.toString());
//    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
//    static void fun(String...v){
//        System.out.println(Arrays.toString(v));
//    }
}
