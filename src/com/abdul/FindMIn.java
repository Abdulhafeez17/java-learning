package com.abdul;

public class FindMIn {
    public static void main(String[] args) {
        int [] arr ={7,5,3,9,-2,8,4,2};
       int kua=min(arr);
        System.out.println(kua);
    }
    static int min(int [] arr){
        int  ans =arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i]<ans){
                 ans = arr[i];
            }
        }
        return ans;
    }
}
