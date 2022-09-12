package com.company;

public class SearchRotatedSortedArray {

    public static void main(String[] args) {

        int[] n = {5,6,7,8,9,10,11,0,1,2};
        int t = 0;

        int maxindex = peek(n);
        System.out.println(maxindex);


    }

    public static int peek(int[] n){

        int s =0;
        int e = n.length-1;

        while(s<=e){

            int m = s + (e-s)/2;

            if(n[s]<n[m] && n[m]>n[e]){
                s=m+1;
            } else if (n[m]<n[e] && n[s] > n[m]){
                e=m-1;
            }
        }
        return s;
    }


}
