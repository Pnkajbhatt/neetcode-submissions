class Solution {
    Integer[] dp;
    public int tribonacci(int n) {
        dp = new Integer[n+1];
        return tribon(n);
    }
    public int tribon(int n) {
       
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        if(dp[n] != null) return dp[n];
        return dp[n] = tribon(n-1) + tribon(n-2) + tribon(n-3);
    }
}