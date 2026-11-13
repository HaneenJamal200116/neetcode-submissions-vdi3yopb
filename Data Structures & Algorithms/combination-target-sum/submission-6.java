class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ArrayList<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums,target,0,subset,res);
        return res;
    }
    public void dfs(int[]nums,int target,int start,List<Integer>subset,List<List<Integer>> res) {   
        if(target==0){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(target<0 ) return;
        for(int i=start;i<nums.length;i++){
            subset.add(nums[i]);
            dfs(nums,target-nums[i],i,subset,res);
            subset.remove(subset.size()-1);
        }
    }
}
