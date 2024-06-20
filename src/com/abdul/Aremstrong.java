package com.abdul;

import java.util.Scanner;

public class Aremstrong {
    public static void main(String[] args) {

        for(int i=100;i<1000;i++){
            if(isArmStrong(i)){
                System.out.println(i+"");
            }
        }

    }
    static boolean isArmStrong(int n){
        int originnal =n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum += rem*rem*rem;
        }
        if(sum==originnal){
            return true;
        }
        else {
            return false;
        }

    }
}
