package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Romantoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',2);
        map.put('X',3);
        map.put('L',4);
        map.put('C',5);
        map.put('D',6);
        map.put('M',7);

        HashMap<Character,Integer> map2 = new HashMap<>();
        map2.put('I',1);
        map2.put('V',5);
        map2.put('X',10);
        map2.put('L',50);
        map2.put('C',100);
        map2.put('D',500);
        map2.put('M',1000);
        int sum =0;
        int priorityincoming= map.get(s.charAt(0));
        for(char c : s.toCharArray()){

            if (priorityincoming == map.get(c)) {
                priorityincoming = map.get(c);
                sum += map2.get(c);
            } else if (priorityincoming > map.get(c)) {
                priorityincoming = map.get(c);
                sum += map2.get(c);
            } else if (priorityincoming < map.get(c)) {
                priorityincoming = map.get(c);
                sum = map2.get(c) - sum;
            }

        }
        System.out.println(sum);



    }
}
