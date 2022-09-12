package com.company;

public class MinTimeVisitingPt {

    public static void main(String[] args) {
        int[][] p = {{1,1},{3,4},{-1,0}};

        int t=0;
        for(int i =1;i<p.length;i++){


            int dx = p[i][0]-p[i-1][0];
            int dy = p[i][1]-p[i-1][1];

            if(dx==dy){
                t+=dx;
            } else if(dx<dy) {
                t+=dy;


            }else if(dx>dy) {

                t+=dx;

            }

        }


        System.out.println(t);
    }
}
