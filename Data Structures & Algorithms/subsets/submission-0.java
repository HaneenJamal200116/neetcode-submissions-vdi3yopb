class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List <Integer> subset=new ArrayList<>();
        backTrack(nums,0,subset);
        return res;
    }
    public void backTrack(int nums[],int index,List<Integer>subset){
        if(index==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        backTrack(nums,index+1,subset);
        subset.remove(subset.size()-1);
        backTrack(nums,index+1,subset);

    }
}
