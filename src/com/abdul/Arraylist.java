package com.abdul;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);

        //syntax
    ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(56);
//        list.add(6);
//        list.add(5656);
//        list.add(566);
//        list.add(577);
//        list.add(1);
//        list.add(6);
//        list.add(56);
//        list.add(89);
//        list.add(5);
//        list.add(56265);
//        System.out.println(list);
//
//        list.set(1,9999);
//        System.out.println(list);
//        System.out.println(list.contains(5));
  //input
        for(int i =0;i<5;i++){
            list.add(inn.nextInt());
        }
        // get item at anny index
        for(int i =0;i<5;i++){
            System.out.println(list.get(i)); //pass index here, list{index] syntax will not run here
        }
        System.out.println(list);

    }
}
