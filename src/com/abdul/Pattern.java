package com.abdul;

public class Pattern {
    public static void main(String[] args) {
//        pattern2(5);
//        pattern1(5);
//        pattern3(5);
//        pattern4(5);
       // pattern5(5);
//        pattern28(5);
//
//        pattern30(5);
       // pattern17(5);
        //pattern31(4);
        pattern33(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //when one roe is printed we need to add another newline
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one roe is printed we need to add another newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run the col
            for (int col = 1; col <= n - row + 1; col++) { //run ur brain dummy
                System.out.print("*");
            }
            //when one roe is printed we need to add another newline
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsInrow = row > n ? 2 * n - row: row; // :row stands for otherwise print row only
            for (int col = 0; col < totalcolsInrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run the col
            for (int col = 1; col <= row; col++) { //run ur brain dummy
                System.out.print(col);
            }
            //when one roe is printed we need to add another newline
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsInrow = row > n ? 2 * n - row  : row;
            int numspaces=n-totalcolsInrow;
            for(int s=0;s<numspaces;s++){
                System.out.print(" ");
            }
            for (int col = 0; col <totalcolsInrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for(int row =1;row<=n;row++){
       for(int space=0; space<n-row ;space++){
           System.out.print(" ");
       }
            for(int col=row; col>=1;col--){
                System.out.print(col);
            }
        for( int col=2; col<=row;col++) {
            System.out.print(col);
        }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int row =1;row<2*n;row++){
            int c=row > n ? 2*n - row: row;
            for(int space=0; space<n-c;space++){
                System.out.print(" ");
            }
            for(int col=c; col>=1;col--){
                System.out.print(col);
            }
            for( int col=2; col<=c;col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int ateveryindex =Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }

    }
    static void pattern33(int n){
        int orifinaln = n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int ateveryindex =orifinaln-Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }

    }

}
