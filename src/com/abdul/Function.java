//package com.abdul;
//
//import jdk.dynalink.beans.StaticClass;
//
//import java.util.Scanner;
//
//public class Function {
//    public static void main(String[] args) {
//        sum();
//    }
//        static void sum() {
//            Scanner in = new Scanner(System.in);
//            int num1 = in.nextInt();
//            int num2 = in.nextInt();
//            int sum =  num1 + num2;
//            System.out.println("sum is ="+sum);
//
//        }
//
//}
package com.abdul;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        //returning the sum to the function call

//       int ans = sum();
//        System.out.println(ans);
        int ans = sum3(20,30);
        System.out.println(ans);

    }
    // pass the value ofnumbers when u r calling the method in java main()
    static int sum3(int a, int b){
        int sum = a+ b;
        return sum;
    }
    static int sum() { // we use int because int + int = int
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum =  num1 + num2;
        return sum;

    }

}

