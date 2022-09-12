package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        HashMap<Character,Integer> mp = new HashMap<>();
        for (char c:s.toCharArray()) {


            mp.put(c,mp.getOrDefault(c,0)+1);

        }
        int ans=1;
        for (int i=1;i<=s.length();i++){
            ans*=i;
        }
        for(Map.Entry<Character,Integer> en:mp.entrySet()){
            int j = en.getValue();

            int ss = 1;
            for (int k=1;k<=j;k++){
                ss*=k;
            }
            ans = ans/ss;
        }

        System.out.println(ans);

    }


}
