package com.company;

public class kbeauty {
    public static void main(String[] args) {
        int num = 430043;
        int k = 2;
        String n = String.valueOf(num);
        int c =0;
        for(int i =0;i<=n.length()-k;i++){
            String subn = n.substring(i,i+k);
            System.out.println(subn);
            int div = Integer.valueOf(subn);
            if (div==0){
                continue;
            }
            if(num%div == 0){
                c++;
            }


        }
        System.out.println(c);
    }
}
