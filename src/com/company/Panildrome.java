package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Panildrome {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
       int x= sc.nextInt();
        boolean ans=true;

        List<Integer> n = new ArrayList<>();

        if(x<0){
            ans= false;
        } else {

            while(x!=0){



                int lastdigit= x % 10;

                x=(int)(x/10);

                n.add(lastdigit);


            }

            for(int i=0;i<n.size();i++){

                if(!Objects.equals(n.get(i), n.get(n.size() - 1 - i))){
                    ans= false;
                }


            }

        }
        System.out.println(ans);
    }
}
