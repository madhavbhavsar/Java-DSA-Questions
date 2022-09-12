package com.company;

import java.util.ArrayList;
import java.util.List;

public class Arrayafterremovinganagra {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();

        String[] words = {""};
        String check = words[0];

        for(int i=1;i<words.length;i++){

            String nw = words[i];

            if(isanagram(check,nw)){


            } else {
                ans.add(check);
                check = words[i];

            }

        }
        ans.add(check);
        System.out.println(ans);
    }

    public static boolean isanagram(String s1,String s2){
        return false;
    }
}
