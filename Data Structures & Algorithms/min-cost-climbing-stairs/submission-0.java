class Solution {
    Integer[] dp ;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new Integer[n+1];
        return Math.min(stairs(cost,n-1) , stairs(cost,n-2));
    }
    public int stairs(int[] cost, int n) {
        if(n == 0 || n == 1){
            return cost[n];
        }

        if(dp[n] != null) return dp[n];

        return dp[n] = cost[n] + Math.min(stairs(cost,n-1) , stairs(cost,n-2));
     }
}
