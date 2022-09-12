package com.company;

import java.util.ArrayList;
import java.util.List;

public class contest8may {

    public static void main(String[] args) {
        String n = "6777133339";
        String ans = "";
        List<String> aa= new ArrayList<>();


        for(int i =0;i<n.length()-2;i++){


            if(( n.charAt(i) == n.charAt(i+1) ) &&  ( n.charAt(i+2) == n.charAt(i+1) )){
                aa.add(n.substring(i,i+3));
            }



        }
        if (aa.isEmpty()){
            //return "";
        }


        System.out.println(aa);
        ans = aa.get(0);
        for(String s:aa){

            if(Integer.parseInt(s) > Integer.parseInt(ans)){
                ans = s;
            }

        }
        System.out.println(ans);


    }
}
