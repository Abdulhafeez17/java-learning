package com.abdul;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr ={5,6,3,2,7};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums,int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e=  hi;
        int m=s+(e-s)/2;
        int pivot = nums[m];
        while(s<=e){
            //if it is already sorted it will just skip
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]<pivot){
                e--;
            }
            if(s<=e){
                int tem=nums[s];
                nums[s]=nums[e];
                nums[e]=tem;
                s++;
                e--;


            }
            //now my pivot is at correct index pleas sort two halves now
            sort(nums,s,hi);
        }
    }
}
