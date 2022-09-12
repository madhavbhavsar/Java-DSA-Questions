package com.company;

public class SplitPanildrome {
    public static void main(String[] args) {
        // write your code here
        String a = "xy";
        String b = "yx";
        System.out.println(checkPalindromeFormation(a,b));
    }

    public static boolean checkPalindromeFormation(String a, String b) {

        for(int i=0;i<a.length();i++){

            String a1 = a.substring(0,i);
            String a2 = a.substring(i,a.length());
            String b1 = b.substring(0,i);
            String b2 = b.substring(i,a.length());

            if(ispanil(a1+b2) || ispanil(b1+a2) ){
                return true;
            }


        }
        return false;

    }

    public static boolean ispanil(String p){


        for(int i=0;i<p.length();i++ ){
            if(p.charAt(i) != p.charAt(p.length()-1-i)){
                return false;
            }


        }
        return true;


    }
}
