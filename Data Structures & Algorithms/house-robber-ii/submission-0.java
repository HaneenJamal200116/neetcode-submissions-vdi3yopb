
class Solution {
    public int rob(int[] nums) {
        if (nums.length < 2)
            return nums[0];

        int[] skipFirst = new int[nums.length - 1];
        int[] skipLast = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            skipFirst[i] = nums[i + 1];
            skipLast[i] = nums[i];
        }
        // [2,7,3,1,4,2,1,8]
        // skip last -> [2,7,3,1,4,2,1]
        // skip first-> [7,3,1,4,2,1,8]

        int loot1 = helper(skipFirst);
        int loot2 = helper(skipLast);

        return Math.max(loot1, loot2);
    }
    public int helper(int[] nums) {
        if (nums.length < 2)
            return nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
