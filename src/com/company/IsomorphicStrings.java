package com.company;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s="egg";
        String t = "add";
        Map<Character,Character> map = new HashMap<>();

        for(int i =0;i<s.length();i++){

            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),t.charAt(i));
            } else {
                char a = map.get(s.charAt(i));
                char b = t.charAt(i);
                if(a!=b){
                    System.out.println(false);
                }

//                if(map.get(s.charAt(i)) != s.charAt(i)){
//
//                    System.out.println(false);
//                }

            }

        }

        System.out.println(true);
    }
}
