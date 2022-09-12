package com.company;

public class atoi {

    public static void main(String[] args) {
        String s="66r34";
        s=s.trim();
        StringBuilder ns= new StringBuilder();
        for(char c :s.toCharArray()){

            if((c>='0' && c<='9')|| c=='.' || c=='+' || c=='-'){
                ns.append(c);

            }else if((c>='a' && c<='z') ||(c>='A' && c<='Z')|| c==' '){
                break;
            }


        }
        System.out.println(ns.toString());

    }
}
