package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupanagram {

    public static void main(String[] args) {

        String[] aa = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> aaa= groupAnagrams(aa);
        System.out.println(aaa);

    }

    public static List<List<String>> groupAnagrams(String[] l) {
        int co = 0;
        List<List<String>> ans= new ArrayList<>();
        List<String> it = new ArrayList<>();
        it.add(l[0]);
        ans.add(it);


        for(int i =1;i<l.length;i++){
            String d = l[i];
            boolean b = false;
            for(int j=0;j<ans.size();j++){

                List<String> check = ans.get(j);
                String c = check.get(0);

                if(isanagram1(c,d)){
                    check.add(d);
                    b=true;
                    break;

                }

            }
            if(!b){
                it = new ArrayList<>();
                it.add(d);
                it.clear();

            }





        }

        return ans;

    }

    private static boolean isanagram1(String c, String d) {
        if(c.length()!= d.length()){
            return false;
        }
        HashMap<Character,Integer> hp = new HashMap<>();
        for(int x=0;x<c.length();x++){
            if( hp.get(c.charAt(x))==null){
                hp.put(c.charAt(x),1);
            } else {
                hp.put(c.charAt(x),hp.get(c.charAt(x))+1);
            }
        }
        for(int z=0;z<d.length();z++){
            if( hp.get(d.charAt(z))==null){
                return false;
            } else {
                hp.put(d.charAt(z),hp.get(d.charAt(z))-1);
            }
        }

        for(Map.Entry<Character,Integer> i : hp.entrySet()){
            if(i.getValue()!=0){
                return false;
            }
        }
        return true;

    }
}
