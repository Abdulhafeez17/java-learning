//package com.abdul;
//
//public class Factors {
//    public static void main(String[] args) {
//        factors1(20);
//
//    }
//    static void factors1(int n){
//        for(int i =1;i<=n;i++){
//            if(n%i==0){
//                System.out.println(i +" ");
//            }
//        }
//    }
//    static void  factors2(int n){ // we will get the output in unsorted order
//        for(int i=1;i<Math.sqrt(n);i++){
//            if(n%i==0){
//                if(n/i == i){
//                    System.out.println(i); //if we get 6*6 we just ignoring the duplicate ones
//                }
//                else {
//                    System.out.println(i+" "+n/i+" ");
//                }
//            }
//        }
//    }
//    //both time and space  with be O(sqrt(n))
//
//    static void factors3(int n){
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=1;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                if(n/i == i){
//                    System.out.println(i + " ");
//
//                }
//                else {
//                    System.out.println(i +" ");
//                    list.add(n/i);
//                }
//            }
//        }
//        for(int i= list.size()-1;i>=0;i--){
//            System.out.print(list.get(i+" "));
//        }
//    }
//}
