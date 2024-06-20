package com.abdul;

import java.util.Arrays;

public class Searchsting {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
       // System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray())); //converting the string to arrray form
    }
    static Boolean search2(String str,char target){
        if(str.length() == 0){     //str.length() is a simpple function
            return false;
        }
        for(char ch :str.toCharArray()){ // we aaare just iterating on the array
            if(ch ==target){
                return true;
            }
        }
        return false;
    }
    static Boolean search(String str,char target){
        if(str.length() == 0){     //str.length() is a simpple function
        return false;
        }
        for(int j=0; j< str.length();j++){

            if(target == str.charAt(j)){
                return true;
            }
        }
        return false;
    }
}
