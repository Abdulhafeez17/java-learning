package com.abdul;

public class Subset1 {
    public static void main(String[] args) {
     subsec("","abc");
        // for arraylist System.out.println( subsec("","abc"););
    }
    static void subsec(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subsec(p,up.substring(1));
        subsec(p+ch ,up.substring(1));
    }
    static Arraylist<String> subsec(String p,String up){
        if(up.isEmpty()){
            Arraylist<String> list = new Arraylist<>();
            list.add(p);//just to print the initial or the perticular line of out put
            return list;
        }
        char ch= up.charAt(0);
     Arraylist<String> left=  subsec(p,up.substring(1));
        Arraylist<String> right=subsec(p+ch ,up.substring(1));
        left.addAll(right);
        return left;//u can return left or right becouse both of the are same
    }
}
