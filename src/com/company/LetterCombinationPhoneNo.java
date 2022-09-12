package com.company;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhoneNo {
    static String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    static List<String> ans  = new ArrayList<>();
    public static void main(String[] args) {

        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printcomb("","27");
        System.out.println(ans);
    }
    public static void printcomb(String p,String up){

        if (up.isEmpty()){
            System.out.println(p);
            ans.add(p);
            return;
        }

        int i = (int)(up.charAt(0)-'0');
        for (int j = 0; j < arr[i].length(); j++) {

            printcomb(p+arr[i].charAt(j),up.substring(1));
        }

    }
}
