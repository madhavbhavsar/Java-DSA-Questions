package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MajorityElement3 {
    public static void main(String[] args) {
        int[] n = {1,2};
        System.out.println(majorityElement(n));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> aa = new Stack<>();

        int n1 = -1;
        int n2 = -1;
        int c1=0,c2=0;


        for(int el:nums){

            if(el==n1){
                c1++;
            } else if(el==n2){
                c2++;
            } else if (c1==0){
                n1 = el;
                c1=1;

            } else if (c2==0){
                n2=el;
                c2=1;
            } else {
                c1--;
                c2--;
            }
        }

        int nc1 =0;
        int nc2=0;
        for(int n:nums){
            if(n==n1){
                nc1++;
            }
            if(n==n2){
                nc2++;
            }
        }

        if(nc1>(nums.length/3)){
            ans.add(n1);
        }else if(nc2>(nums.length/3)){
            if(n1!=n2){
                ans.add(n2);
            }
        }


        return ans;
    }
}
