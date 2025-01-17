package com.abdul;

public class Skipchar {
    public static void main(String[] args) {
      // skip("","baccad");
        //System.out.println( skip("baccad"));
        System.out.println( skipApple("bacapplecad"));
        System.out.println( skipAppnotapple("bacappecad"));
    }
    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));

        }else{
            skip(p+ch,up.substring(1));
        }
    }
    //case 2
    static String  skip( String up){
        if (up.isEmpty()){

            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
           return skip(up.substring(1));

        }else{
           return ch+skip (up.substring(1));
        }
    }
    static String  skipApple( String up){
        if (up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));

        }else{
            return up.charAt(0)+skipApple(up.substring(1));
        }
    }
    static String  skipAppnotapple( String up){
        if (up.isEmpty()){
            return "";
        }

        if(up.startsWith("app")&& !up.startsWith("apple")){
            return skipAppnotapple(up.substring(5));

        }else{
            return up.charAt(0)+skipAppnotapple(up.substring(1));
        }
    }
}
