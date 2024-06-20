package com.abdul;

public class SeachInRange {
    public static void main(String[] args) {
        int [] arr={12,5,6,78,15,21,0,1};
        int num = 1;
        int ans=search(arr,num,0,5);
        System.out.println(ans);
    }
    //search in the array:return the index of the item if it exist
    //otherwise return -1
    static int search(int [] arr,int num ,int start, int end){
        for(int i=start;i<end;i++) {
            if (num == arr[i]) {
                System.out.println("element is" + arr[i]);
                return i;
            }

        }
        return -1;
    }
}
