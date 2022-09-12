package com.company;

import java.util.ArrayList;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(adddBinary("11","1"));
        //System.out.println(0|0);
    }
    public static String adddBinary(String a, String b) {

        int pa = a.length()-1;
        int pb = b.length()-1;
        // StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        int c=0;

        while(pa>=0||pb>=0){

            int la=0;
            if(pa>=0){
                la = Integer.parseInt( String.valueOf( a.charAt(pa)) );
            }
            int lb=0;
            if(pb>=0){
                lb =Integer.parseInt( String.valueOf( b.charAt(pb)) );
            }

            int s = c^la^lb;
            c = (c&la) | (la&lb) | (c&lb);
            //sb.insert(0,String.valueOf(s)+sb);
            arr.add(0,s);

            pb--;
            pa--;

        }
        arr.add(0,c);
        
        return "";
    }
}
