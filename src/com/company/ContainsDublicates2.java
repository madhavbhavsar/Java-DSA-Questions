package com.company;

import java.util.HashMap;

public class ContainsDublicates2 {

    public static void main(String[] args) {

        int[] nums= {1,2,3,1};
        int k =3;
        HashMap<Integer,Integer> hp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hp.get(nums[i])==null){
                hp.put(nums[i],i);
            } else {
                int o = hp.get(nums[i]);
                if(i-o==k){
                    System.out.println(true);
                }

            }


        }
        System.out.println(false);


    }
}
