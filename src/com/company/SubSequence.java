package com.company;

public class SubSequence {

    public static void main(String[] args) {
        subseq("","abc");
    }

    public static void subseq(String up,String p){

        if (p.isEmpty()){
            System.out.println(up);
            return;
        }

        subseq( up+p.charAt(0),p.substring(1));
        subseq(up+"",p.substring(1));

    }

}
