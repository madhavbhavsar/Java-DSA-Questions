package com.company;

public class dividetwoint {


    public static void main(String[] args) {
        int dividend = 1;
        int divisor = 1;

        int count = 0;
        boolean neg = false;

        if(dividend<0) {
            neg = true;
            dividend = (-1 * dividend);
        }
        if(divisor<0) {
            neg = true;
            divisor = (-1 * divisor);
        }
        if(divisor<0 && dividend <0) {
            neg = false;
            divisor = (-1 * divisor);
            dividend = (-1 * dividend);
        }

        if(dividend<divisor) {
            System.out.println(0);
        } else {

            while (dividend > 0) {
                dividend = dividend - divisor;
                count++;
            }
        }

        if(neg) {
            count = (-1 * count);
        }

        System.out.println(count-1);
    }

}