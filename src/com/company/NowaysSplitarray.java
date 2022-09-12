package com.company;

public class NowaysSplitarray {
    public static void main(String[] args) {

        int[] n = {-2,-1,0,1,2};

        long ts = 0;
        for (int i:n) {
            ts+=i;
        }
        System.out.println(ts);
        int c =0;
        long cs = 0;
        for (int i = 0; i <n.length-1 ; i++) {
            cs+=n[i];
            System.out.println(cs+" "+(ts-cs));
            if(cs >= ts-cs){
                c++;
            }

        }
        System.out.println(c);



    }
}
