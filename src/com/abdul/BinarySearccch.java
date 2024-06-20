package com.abdul;

public class BinarySearccch {
    public static void main(String[] args) {
     int [] arr={1,2,3,4,6};
     int target=2;
     int ans =binarysearch(arr,target);
        System.out.println(ans);
    }
    //return the index
    //retur -1 if it doesnt exist
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
              end= mid-1;
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
     }
}

//
//package com.abdul;
//
//public class BinarySearccch {
//    public static void main(String[] args) {
//        int [] arr={1,2,3,4,6};
//        int target=2;
//        int ans =binarysearch(arr,target);
//        System.out.println(ans);
//    }
//    //return the index
//    //retur -1 if it doesnt exist
//    static int binarysearch(int[] arr,int target){
//        int start=0;
//        int end = arr.length-1;
//        boolean isASC=(arr[start]<arr[end]);
//        while(start<=end){
//
//    }
//            int mid = start+(end-start)/2;
//           if(arr[mid]==target){
//               return mid;
//               if(isASC) {
//                   if (target < arr[mid]) {
//                       end = mid - 1;
//                   } else {
//                       start = mid + 1;
//                   }
//               }
//         else {
//                       if(target>arr[mid]){
//                           end=mid-1;
//                       }
//                       else {
//                           start=mid+1;
//                       }
//            }
//        }
//        return -1;
//    }
//}
//
//
//
//package com.kunal;
//
//public class Ceiling {
//
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int target = 15;
//        int ans = ceiling(arr, target);
//        System.out.println(ans);
//    }
//
//    // return the index of smallest no >= target
//    static int ceiling(int[] arr, int target) {
//
//        // but what if the target is greater than the greatest number in the array
//        if (target > arr[arr.length - 1]) {
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                // ans found
//                return mid;
//            }
//        }
//        return start;
//    }
//}