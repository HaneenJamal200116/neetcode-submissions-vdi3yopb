class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, subset, res, 0);
        return res;
    }
    public void dfs(int[] nums, List<Integer> subset, List<List<Integer>> res, int start) {
     
            res.add(new ArrayList<>(subset));
        
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            dfs(nums,subset,res,i+1);
            subset.remove(subset.size()-1);
        }
    }
}
