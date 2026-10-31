class Solution {
    public int longestConsecutive(int[] nums) {
        int max=1;
        int cnt=1;
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]) continue;
            if(nums[i]-nums[i-1]==1){
                cnt++;
                max=Math.max(max,cnt);
            } 
            else{
                cnt=1;
            }
        }
        return max;
    }
}
