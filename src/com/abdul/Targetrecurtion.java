//package com.abdul;
//
//public class Targetrecurtion {
//    public static void main(String[] args) {
//        int arr [] = {1,6,3,8,7};
//        System.out.println(findindex(arr,4,0));
//    }
//    static boolean find(int [] arr,int target,int index){
//        if(index == arr.length){
//            return false;
//        }
//        return arr[index] == target || find(arr,target,index+1);
//
//    }
//    static int findindex(int[] arr, int target,int index){
//        if(index ==arr.length){
//            return -1;
//        }
//        if(arr[index] == target ){
//            return index;
//        }
//        else {
//            return findindex(arr, target, index +1}
//    }
//    static int findlastindex(int[] arr, int target,int index){
//        if(index ==-1){
//            return -1;
//        }
//        if(arr[index] == target ){
//            return index;
//        }
//        else {
//            return findlastindex(arr, target, index - 1);
//        }
//    }
//    static Arraylist<Integer> findallindex(int arr[],int target,int index,Arraylist<Integer>list){
//        if(index == arr.length){
//            return list;
//        }
//        if(arr[index]==target){
//            list.add(index);
//
//        }
//        return findallindex(arr,target,index+1,list);
//    }
//
//}
