package com.company;

public class Binarysearch {

    public static void main(String[] args) {
        int[] arr = {2,5,9,10,15,20,30};
        int target = 11;
        int ans = 0;
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int m = (start+end)/2;
            if(arr[m]==target) {
                System.out.println(m);
                break;
            } else if (arr[m] <target){
                start = m+1;
            } else if (arr[m] > target){
               end = m-1;
            } else if((start == end)) {

            }
        }
        System.out.println(start);

    }


}
