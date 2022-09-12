package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Plusone {

    public static void main(String[] args) {



        int[] digits = {9,8,7,6,8,8};


        int sum=0;

        for(int i =0;i<digits.length;i++){

            sum=sum*10;
            sum = sum+digits[i];


        }

        sum+=1;
        int aa = sum;
        int count=0;
        while (aa!=0){
            count++;
            aa=aa/10;
        }
        System.out.println(sum);
        System.out.println(count);

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {

            arr[count-i-1] = (sum%10);
            sum=sum/10;

        }

        System.out.println(Arrays.toString(arr));

    }


}
