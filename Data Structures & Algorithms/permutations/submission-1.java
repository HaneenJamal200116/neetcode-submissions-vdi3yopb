class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, subset, res);
        return res;
    }
    public void dfs(int[] nums, List<Integer> subset, List<List<Integer>> res) {
        if (nums.length == subset.size()) {
            res.add(new ArrayList<>(subset));
            return;
        }
        for (int num : nums) {
            if (subset.contains(num))
                continue;
            subset.add(num);
            dfs(nums, subset, res);
            subset.remove(subset.size() - 1);
        }
    }
}
