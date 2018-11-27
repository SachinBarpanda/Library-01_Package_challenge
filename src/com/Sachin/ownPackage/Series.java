package com.Sachin.ownPackage;

public class Series {
    private static int sum;
    private static int fibonnaci;
    private static int factorial;

    public void Series(int sum,int factorial,int fibonnaci){
        this.factorial=factorial;
        this.fibonnaci=fibonnaci;
        this.sum=sum;
    }
    public static int nSum(int n){
        sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
            System.out.print(sum+"\t");
        }
        return sum;
    }
    public static int factorial(int n){
        factorial=1;
        System.out.print("0\t");
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
            System.out.print(factorial+"\t");
        }
        return factorial;
    }
    public static int Fibonnaci(int n){
        fibonnaci=1;
        int prev=0,current=0;
        for(int i=0;i<=n;i++) {
            if(i<1)System.out.print("0\t1\t");
            else {
                current = fibonnaci;
                fibonnaci = current + prev;
                System.out.print(fibonnaci + "\t");
                prev = current;
            }
        }
        return fibonnaci;
    }
}
