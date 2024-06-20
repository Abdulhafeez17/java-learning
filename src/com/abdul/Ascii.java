package com.abdul;

public class Ascii {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch+0);
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
    static void subsecAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        Arraylist<String> first= subsecAscii(p,up.substring(1));
        Arraylist<String> second=subsecAscii(p+(ch+0) ,up.substring(1));
        Arraylist<String> third =subsecAscii(p+ch ,up.substring(1));
        first.addAll(second);
        first.addAll(second);
        return first;
    }
}
