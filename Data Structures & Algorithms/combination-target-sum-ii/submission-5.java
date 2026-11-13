class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(candidates, target, res, subset, 0);
        return res;
    }
    public void dfs(
        int[] nums, int target, List<List<Integer>> res, List<Integer> subset, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(subset));
            return;
        }

   

        if (target < 0)
            return;

        for (int i = start; i < nums.length; i++) {
             if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            subset.add(nums[i]);
            dfs(nums, target - nums[i], res, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
