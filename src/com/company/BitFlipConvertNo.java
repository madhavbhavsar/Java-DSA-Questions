package com.company;

public class BitFlipConvertNo {

    public static void main(String[] args) {
        System.out.println(minBitFlips(3,4));

    }
    public static int minBitFlips(int s, int g) {

        StringBuilder ss = new StringBuilder();
        StringBuilder gg = new StringBuilder();

        int c=0;
        while(s!=0 || g!=0){
            int r1 = s%2;
            ss.insert(0,s%2);
            s/=2;
            int r2=g%2;
            gg.insert(0, g%2);
            g/=2;

            if ((r1^r2)==1)c++;
        }
//        while(g!=0){
//            int r = g%2;
//
//        }

        System.out.println(ss+" "+gg);

        return c;



    }
}
