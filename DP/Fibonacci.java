package DP;

import java.util.Arrays;

public class Fibonacci {
    // recursive
    public static int fibo(int num){
        if(num <= 1){
            return num;
        }
        return fibo(num-1) + fibo(num-2);
    }

    // recursive + memorization(TD)
    public static int memorization(int dp[],int num){
        if(num <= 1) return num;
        if(dp[num] != -1) return dp[num];
        return dp[num] = memorization(dp,num-1) + memorization(dp,num-2);
    }

    // O(1) Space: space optimization(BU)+
    public static int tabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    // O(1) Space
    public static int fib(int n){
        int a = 0, b = 1, c;
        if(n == 0){
            return a;
        }
        for(int i=2; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int  n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(memorization(dp,n));
        System.out.println(tabulation(n));
        // System.out.println(fib(n));
    }
}