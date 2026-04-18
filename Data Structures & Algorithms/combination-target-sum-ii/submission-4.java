class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates,new ArrayList<>(),target,0);
        return res;
    }
     public void backTrack(int nums[],List<Integer> curr,int remain,int index){
        if(remain==0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1])continue;
            if (nums[i] > remain) break;
            curr.add(nums[i]);
            backTrack(nums,curr,remain-nums[i],i+1);
            curr.remove(curr.size()-1);
        }
    }
}
