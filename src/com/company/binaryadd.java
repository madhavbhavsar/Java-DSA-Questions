package com.company;

public class binaryadd {

    public static void main(String[] args) {
        String a = "0";
        String b = "0";

        long suma =0;
        for (int i = 0; i < a.length() ; i++) {

            int temp = (int) (Integer.parseInt(  String.valueOf( a.charAt(i)) ) * Math.pow(2, (a.length()-i-1) ));

            suma+=temp;
        }

        int sumb =0;
        for (int i = 0; i < b.length() ; i++) {

            int temp = (int) (Integer.parseInt(  String.valueOf( b.charAt(i)) ) * Math.pow(2, (b.length()-i-1) ));

            sumb+=temp;
        }

        //int c = suma+sumb;
//        String sc = "";
//        while (c>-1){
//
//            sc= String.valueOf(c%2)+sc;
//            c=c/2;
//        }


//        System.out.println(sc);






    }
}
