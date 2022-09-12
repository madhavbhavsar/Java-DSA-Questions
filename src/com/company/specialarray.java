package com.company;

public class specialarray {
    public static void main(String[] args) {

        int[] n = {3,6,7,7,0};
//[3,6,7,7,0]

        System.out.println(specialArray(n));
    }

    public static int specialArray(int[] n) {

        int l =0;
        int h =n.length;
        int ans = -1;
        while(l<=h){

            int m = (l+h)/2;

            if(solve(n,m)){
                ans = m;
                l=m+1;
            } else {

                h=m-1;
            }




        }
        return ans;






    }

    public static boolean solve(int[] n,int m){
        int c=0;
        for(int i:n){
            if(i>=m){
                c++;
            }
            if(c==m){
                return true;
            }

        }
        return false;

    }
}
