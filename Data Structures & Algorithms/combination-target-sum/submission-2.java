class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backTrack(nums,new ArrayList<>(),target,0);
        return res;
    }
    public void backTrack(int nums[],List<Integer> curr,int remain,int index){
        if(remain==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(remain<0) return;
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            backTrack(nums,curr,remain-nums[i],i);
            curr.remove(curr.size()-1);
        }
    }
}
