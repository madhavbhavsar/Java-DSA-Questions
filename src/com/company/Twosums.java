package com.company;

import java.util.Scanner;

public class Twosums {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("array length");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n ; i++) {
            nums[i]=sc.nextInt();
        }

        System.out.println("target");
        int target = sc.nextInt();

        int[] ans = new int[2];

        for (int i =0;i<nums.length;i++){

            int temp= nums[i];


            for (int j = i+1;j<nums.length;j++){

                System.out.println(nums[i] + " "+ nums[j]);

                int add = nums[i]+nums[j];

                if(add==target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }

        }


        System.out.println(ans[0]+" "+ans[1]);


    }
}
