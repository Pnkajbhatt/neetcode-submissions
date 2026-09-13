class Solution {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+1];
        return stairs(n,dp);
    }
    public int stairs(int n,Integer[] dp) {
        if(n == 1 || n==2) return n;
        if(dp[n] != null) return dp[n];
        return dp[n] = stairs(n-1,dp) + stairs(n-2,dp);
    }
}
