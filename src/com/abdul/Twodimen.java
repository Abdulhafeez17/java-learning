package com.abdul;

import jdk.jshell.SourceCodeAnalysis;

import javax.script.ScriptContext;
import java.util.Arrays;
import java.util.Scanner;

public class Twodimen {
    public static void main(String[] args) {
        /* 1 2 3
           2 3 5
           4 5 6
         */
       // int [][] arr = new int[3][]; // number of columns is not mandetory

//        int [][] arr = {
//            {1,2,3}, //0th index
//            {5,3},//1st index
//            {8,6,9,5} //2inndex
//        };
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for(int i = 0;i < arr.length; i++){
         for(int j = 0;j < arr[i].length; j++){
             arr[i][j] = in.nextInt();
         }
        }

//        for(int i = 0;i < arr.length;i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for(int i = 0;i < arr.length;i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
