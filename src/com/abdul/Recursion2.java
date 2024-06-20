package com.abdul;

public class Recursion2
{
    public static void main(String[] args) {
        print(5);
        print1(1);
        print2(1);
    }
    static void print(int n){
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }

    }
    static void print1(int n){
        if(n<5) {
            System.out.println(n);
            print1(n + 1);
        }
        else{
            System.out.println("rnd");
        }
}
    static void print2(int n){
        if(n==5) {
            System.out.println(5);
            return;
        }

    System.out.println(n);
    print2(n + 1);
    }

}
