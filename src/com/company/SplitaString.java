package com.company;

public class SplitaString {

    public static void main(String[] args) {
        String s = "0000";
        System.out.println(numWays(s));


    }
    public static int numWays(String s) {

        int sum=0;
        for (char c:s.toCharArray()) {
            sum+=Integer.parseInt(String.valueOf(c));
        }
        if (sum%3!=0){
            return 0;
        }
        int subsum = sum/3;
        int l=0;
        int lsum=0;
        int rsum=0;
        int r=s.length()-1;
        int c=1;

        while((lsum!=subsum)) {
            lsum += Integer.parseInt(String.valueOf(s.charAt(l)));
            if (lsum < subsum) {

                l++;
            }
        }
        while ((rsum!=subsum)){
            rsum+=Integer.parseInt(String.valueOf(s.charAt(r)));
            if (rsum<subsum){

                r--;
            }

        }

        l++;r--;
        while(l<r){
            boolean b = false;
            boolean v = false;
            if(s.charAt(l)=='0'){
                c++;
                l++;
                b=!b;
            }
            if(s.charAt(r)=='0'){
                c++;
                r--;
                v=!v;
            }
            if((b&&v) ){
                c++;
            }
            if(l==r){
                c--;
            }

        }






        return c;
    }

}
