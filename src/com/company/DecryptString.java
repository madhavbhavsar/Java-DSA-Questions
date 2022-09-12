package com.company;

public class DecryptString {

    public static void main(String[] args) {
        String s = "123#45";
        String ans = "";

        for(int i = s.length() -1; i>=0 ;i-- ){

            if(s.charAt(i) == '#'){
                String ns = s.substring(i-2,i);
                int xx = Integer.parseInt(ns);
                char y = (char) ('a'+xx-1);
                ans = String.valueOf(y) + ans;
                i=i-2;


            } else {

                char x = s.charAt(i);
                int xx = Integer.parseInt(String.valueOf(x));
                char y = (char) ('a'+xx-1);
                ans = String.valueOf(y) + ans;


            }
        }

        System.out.println(ans);

    }
}
