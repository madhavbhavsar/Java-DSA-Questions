package com.company;

public class mypower {
    public static void main(String[] args) {

        double x = 2;
        int n = 483647;
        System.out.println("ans = "+myPow(x,n));


    }

    public static double myPow(double x, int n) {
        boolean neq=false;

        if(n==0){
            return 1;
        }
        if(n<0){
            neq=true;
            n*=(-1);
        }
        double ans=x;


        int lasti=1;
        for(int i=2;i<=n;){
            ans*=ans;
            lasti=i;
            i*=2;

        }
        //List<Double> arr = new ArrayList<>();
        System.out.println(ans);
        double c = myPow(x,n-lasti);

        // for(int j=0;j<n-lasti;j++){
        //     ans*=x;
        // }


        if(neq){
            ans=1/ans;
        }
        return ans*c;

    }
}
