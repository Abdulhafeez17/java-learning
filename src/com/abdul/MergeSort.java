package com.abdul;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr ={5,6,3,4,8,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int [] mergesort(int[] arr){ // int[] because it need to rweturn a aray
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right =mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merges(left,right);
    }
    private static int[] merges(int[] first,int[] second){
        int [] mix = new int[first.length+second.length];
        int i = 0; //pointer for arr1
        int j = 0; //pointer for arr2
        int k = 0; //pointer for new arr
        while(i<first.length && j<second.length){
            if (first[i] < second[j]){
                mix[k]=first[i];
                i++;
            }else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //it amy be possible that5 one of the arrays is not complte
        //copy the remaining elements
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

}
