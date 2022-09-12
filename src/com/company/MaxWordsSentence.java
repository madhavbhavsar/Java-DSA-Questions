package com.company;

public class MaxWordsSentence {

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        for (String s:sentences) {
           int ns = s.split(" ").length;
            System.out.println(ns);

        }

        StringBuilder sb= new StringBuilder();
        



    }
}
