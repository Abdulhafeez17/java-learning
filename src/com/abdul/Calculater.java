package com.abdul;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        //Take input from user tiil user dorsnot press X or x
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true){
            //take an operate as an input
            System.out.println("enter the Operator");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //teke 2 number as input
                System.out.println("enter 2 number");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op=='+'){
                    ans = num1 + num2;
                    System.out.print(ans);
                }
                if (op=='-'){
                    ans = num1 - num2;
                    System.out.print(ans);
                }
                if (op=='*'){
                    ans = num1  * num2;
                    System.out.print(ans);
                }
                if (op=='/'){
                    if (num2 !=0) {
                        ans = num1 / num2;
                        System.out.print(ans);
                    }
                }
                if (op=='%'){
                    ans = num1 % num2;
                    System.out.print(ans);
                }
            }
            else if (op == 'X' || op == 'x'){
                break;
            }
            else
            {
                System.out.println("fuck of");
            }
        }

    }
}
