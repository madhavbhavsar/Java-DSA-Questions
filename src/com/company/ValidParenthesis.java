package com.company;

import java.util.Objects;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String s= "({[]})";

        Stack<String> ns = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String ls = String.valueOf( s.charAt(i));
            if(ls.equals("(") || ls.equals("[") || ls.equals("{")){

                ns.add(ls);
            }else {

                if(ns.isEmpty()){
                    System.out.println("false");
                }
                if(ls.equals(")")&& Objects.equals(ns.peek(), "(")){
                    ns.pop();
                }else if(ls.equals("]")&& Objects.equals(ns.peek(), "[")){
                    ns.pop();
                }else if(ls.equals("}")&& Objects.equals(ns.peek(), "{")){
                    ns.pop();
                }else{
                    System.out.println("false");
                }





            }




        }

        if (ns.isEmpty()){
            System.out.println("true");

        }else{
            System.out.println("false");

        }


    }
}
