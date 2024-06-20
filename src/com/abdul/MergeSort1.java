package com.abdul;



import java.util.Arrays;

public class MergeSort1 {
    public static void main(String[] args) {
        int [] arr ={5,6,3,4,8,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergesort(int[] arr,int s,int e){ // int[] because it need to rweturn a aray
        if(e-s==1){
            return ;
        }
        int mid = (s+e)/2;
         mergesort(arr,s,mid);
         mergesort(arr,mid,e);
         merges(arr,s,mid,e);
    }
    private static void merges(int[] arr,int s,int m,int e){
        int [] mix = new int[e-s];
        int i = s; //pointer for arr1
        int j = m; //pointer for arr2
        int k = 0; //pointer for new arr
        while(i<m && j<e){
            if (arr[i] < arr[j]){
                mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //it amy be possible that5 one of the arrays is not complte
        //copy the remaining elements
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l = 0;l<mix.length;l++){
            arr[s+l]= mix[l];
        }
    }

}
