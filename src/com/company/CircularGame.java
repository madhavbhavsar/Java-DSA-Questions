package com.company;

import java.util.ArrayList;

public class CircularGame {
    public static void main(String[] args) {

        System.out.println(findTheWinner(5,2));;
     }
    public static int findTheWinner(int n, int k) {

        int cpos =0;
        ArrayList<Integer> removedEl = new ArrayList<>();

        while(removedEl.size()!=n-1){


            for(int i=0;i<k;i++){

                for(int j=cpos;;){
                    j=cpos%n;
                    if(removedEl.contains(j)){
                        cpos++;
                        continue;
                    } else {
                        cpos = j+1;
                        break;
                    }


                }



            }

            removedEl.add(cpos-1);
        }
        System.out.println(removedEl);


        return -1;
    }
}
