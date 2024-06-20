package com.abdul;

public class Sortrecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7};
        System.out.println(sorterd(arr,0));

    }
    static boolean sorterd(int [] arr,int index){
        //base condition
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&& sorterd(arr,index+1);
    }

}
