//package com.abdul;
//
//class Solution {
//    public int[][] flipAndInvertImage(int[][] image) {
//        for(int[] row : image)
//            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
//                int temp = row[i] ^ 1;
//                row[i] = row[image[0].length - i - 1] ^ 1;
//                row[image[0].length - i - 1] = temp;
//            }
//        return image;
//    }
//}
//
//
//
////package com.abdul;
////
////import java.util.ArrayList;
////import java.util.List;
////
////public class Solution {
////    public List<Integer> findDisappearedNumbers(int[] arr) {
////        int i = 0;
////        while (i < arr.length) {
////            int correct = arr[i] - 1;
////            if (arr[i] != arr[correct]) {
////                swap(arr, i, correct);
////            } else {
////                i++;
////            }
////        }
////        //just find the missings numbers
////        List<Integer> ans = new ArrayList<>();
////        for (int index = 0; index < arr.length; index++) {
////            if (arr[index] != index + 1) {
////                ans.add(index + 1);
////            }
////        }
////        return ans;
////    }
////     void swap(int[] arr,int first,int second){
////        int temp=arr[first];
////        arr[first]=arr[second];
////        arr[second]=temp;
////    }
////    }
