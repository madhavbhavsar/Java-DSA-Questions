package com.company;

public class ObtainZero {

    public static void main(String[] args) {

        int num1 = 2,num2 = 3;
        int c =0;
        while(true){
            if(num1==0){
                break;
            }
            if(num2==0){
                break;
            }


            if(num1<=num2){
                num2 =num2 - num1;
            } else {
                num1 =num1 -  num2;
            }

            c = c+1;

        }
        System.out.println(c);
    }
}
