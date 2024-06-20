package com.abdul;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in);
      int n = 1223657895;
      int count = 0;
      while (n > 0) {
          int rem = n % 10;
          if (rem == 2) {
              count++;
          }
          n = n / 10;
      }
        System.out.println(count);
    }
}
