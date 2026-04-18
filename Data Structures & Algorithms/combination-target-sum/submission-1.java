class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        backTrack(nums,target,new ArrayList<>(),0,0);
        return res;
    }
    public void backTrack(int nums[],int target,List<Integer> curr,int sum,int index){
        if(sum==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(sum+nums[i]>target) return;
            curr.add(nums[i]);
            backTrack(nums,target,curr,sum+nums[i],i);
            curr.remove(curr.size()-1);
        }
    }
}
