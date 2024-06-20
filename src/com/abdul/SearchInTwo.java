package com.abdul;

import java.util.Arrays;

public class SearchInTwo {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,5},
                {7,4,6,30},
                {8,9,46}
         };
        int target = 46;
        int [] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int [] search(int [][]arr,int target){
        for (int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
