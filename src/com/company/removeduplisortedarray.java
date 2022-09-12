package com.company;

import java.util.ArrayList;
import java.util.List;

public class removeduplisortedarray {

    public static void main(String[] args) {

        int[] n = {1,1,2};

        List<Integer> a = new ArrayList<>();

        for(int i =0;i<n.length;i++){

            if(!a.contains(n[i])){

                a.add(n[i]);

            }


        }

        System.out.println(a.toString());
    }
}
