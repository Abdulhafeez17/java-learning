package com.abdul;

import java.util.Arrays;

public class Swaparrr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 45, 6, 5};
        revers(arr);
        System.out.println(Arrays.toString(arr));
        //  System.out.println(maxRange(arr,1,3));
//        swap(arr,1,2);
//        System.out.println(Arrays.toString(arr));
  }
//    static void swap(int[] arr,int index1,int index2){
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] =temp;


//    }
//    static int maxRange(int[] arr,int start,int end){
//        int maxval = arr[start];
//        //  for(int i=1; i<=array.length;i++)
//        for(int i=start; i<=end;i++){
//            if(arr[i]>maxval){
//                maxval = arr[i];
//            }
//        }
//        return maxval;
        static void revers ( int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        static void swap ( int[] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        }

}