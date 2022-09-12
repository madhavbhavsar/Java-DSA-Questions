package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        rotate(m);
        System.out.println(Arrays.toString(m));
    }
    public static void rotate(int[][] m) {


    }
}
