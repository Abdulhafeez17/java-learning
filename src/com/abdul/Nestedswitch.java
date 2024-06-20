package com.abdul;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int empid = input.nextInt();
        String department = input.next();
        switch (empid){
            case 1:
                System.out.println("abdul hafeez");
                break;
            case 2:
                System.out.println("shahid");
                break;
            case 3:
                System.out.println("print employe 3");
                switch (department){

                    case "IT":
                        System.out.println("it department");
                        break;
                    case "management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("nikal");
                }
                break;
            default:
                System.out.println("number dall ");
        }

    }
}
