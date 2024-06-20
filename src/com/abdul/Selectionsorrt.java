package com.abdul;

import java.util.Arrays;


public class Selectionsorrt {
    public static void main(String[] args) {

        int []arr ={5,2,4,1,3};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void select(int[]arr){
        for(int i=0;i<arr.length;i++){
            //find the masx item in the remaining array and swap with correct index

            int last= arr.length-i-1;
            int maxindex = getMaxindex(arr,0,last);
             swap(arr,maxindex,last);
        }

    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxindex(int [] arr,int start,int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }

}
