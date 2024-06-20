package com.abdul;

import java.util.Arrays;

public class Maxsearch2 {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,5},
                {7,4,6,30},
                {8,9,15}
        };
        int target = 6;
        int [] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);

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
    static int max(int [][]arr){
        int max= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                int element = ints[j];
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}


//class Solution {
//    public int findNumbers(int[] nums) {
//        int count = 0;
//        for(int num :nums){
//            if(even(num)){
//                count++;
//            }
//        }
//        return count;
//    }
//    //function for check wheather a number contains even digits or not
//    static boolean even(int num){
//        int numberofdigits = digit(num);
//        if (numberofdigits % 2 ==0){
//            return true;
//        }
//        return false;
//    }
//
//    //count the number of digits
//    static int digit(int num){
//        int count =0;
//        while(num>0){
//            count++;
//            num=num/10;
//        }
//        return count;
//
//    }
//
//
//}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans =Integer.MIN_VALUE;
        for (int person =0; person<accounts.length;person++){
            int sum =0;
            for (int account =0; account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
            //now we have aa of accounts of person
            //chechk with overall ans
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}