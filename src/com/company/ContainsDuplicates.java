package com.company;

import java.util.HashMap;

public class ContainsDuplicates {

    public static void main(String[] args) {

        int[] n = {1,2,2,1,2};

        HashMap<Integer,Boolean> hp = new HashMap<>();

        for (int nn:n) {

            if(hp.get(nn)==null){
                hp.put(nn,true);
            } else {
                break;
            }

        }


    }
}
