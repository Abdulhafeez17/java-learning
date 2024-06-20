 package com.abdul;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the celsius");
        float celcius = input.nextFloat();
        float fahren = (celcius * 9/5) +32;

        System.out.println("fahren is =" + fahren);
    }
}
