package com.abdul;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Changingvalue {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,8};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0] = 99;//if we make a change the object via this veriable it will effect to original object

    }
}
