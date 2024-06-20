package com.abdul;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruit");
//            case "apple" -> System.out.println("keep doctor away");
//            case "orrange" -> System.out.println("borring");
//            default -> System.out.println("getlossi");
//        }
        int day = input.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednusday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
        switch (day) {
            case 1, 2, 3, 4, 5, 6 -> System.out.println("Weekdays");
            case 7 -> System.out.println("weekend");
        }
    }
}
