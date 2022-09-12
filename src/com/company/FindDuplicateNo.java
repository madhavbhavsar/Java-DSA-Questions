package com.company;

import java.util.Arrays;

public class FindDuplicateNo {

    public static void main(String[] args) {

        System.out.println(findDuplicate(new int[]{1,3,4,2,5}));
    }
    public static int findDuplicate(int[] n) {
        int a=n[0];
        for (int i=1;i< n.length;i++) {
            a=a^n[i];
            System.out.println(a);
        }


        return -1;
    }
}
