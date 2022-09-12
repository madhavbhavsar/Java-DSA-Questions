package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {

int[][] aa = {{1,3},{2,6},{8,10},{15,18}};
int[][] aaaa = merge(aa);
        for (int i = 0; i < aaaa.length; i++) {
            for (int j = 0; j < aaaa[i].length; j++) {
                System.out.print(aaaa[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        //System.out.println(Arrays.toString(intervals));
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));


        List<List<Integer>> ans= new ArrayList<>();


        int lasts = intervals[0][0];
        int laste = intervals[0][1];

        for(int[] a : intervals){


            if(a[0]<=laste){
                laste = Math.max(a[1],laste);
            } else {
                List<Integer> arr = new ArrayList<>();
                arr.add(lasts);
                arr.add(laste);
                ans.add(arr);
                lasts = a[0];
                laste = a[1];
            }


        }
        List<Integer> arr = new ArrayList<>();
        arr.add(lasts);
        arr.add(laste);
        ans.add(arr);

        //System.out.println(ans);
        int[][] anss = new int[ans.size()][2];
//         for(int k =0; k<anss.length;k++){
//             for(int j=0;j<anss[k].length;j++){
//                 anss[k][j] = ans.get(k).get(j);
//             }

//         }
        return anss;

    }
}
