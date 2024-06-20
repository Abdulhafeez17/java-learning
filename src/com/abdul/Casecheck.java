package com.abdul;

import java.util.Scanner;

public class Casecheck {
    // checking uper case or lower case
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);// trim is used to remove the extraspaces
        char ch =  input.next().trim().charAt(0);
        if(ch>='a' && ch<='z') {
            System.out.println("lower case");
        }
        else{
            System.out.println("upper  case");
        }
    }
}
