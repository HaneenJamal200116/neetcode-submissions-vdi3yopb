class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>curr=new ArrayList<>();
        backTrack(nums,curr);
        return res;
    }
    public void backTrack(int nums[],List<Integer>curr){
        if(curr.size()==nums.length){
      res.add(new ArrayList<>(curr));return;}
      for(int num:nums){
        if(curr.contains(num)) continue;
        curr.add(num);
        backTrack(nums,curr);
        curr.remove(curr.size()-1);
      }
    }
}
