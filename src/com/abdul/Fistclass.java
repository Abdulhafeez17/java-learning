package com.abdul;

import java.util.Scanner;

public class Fistclass {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
