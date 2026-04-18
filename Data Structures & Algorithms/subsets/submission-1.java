class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List <Integer> subset=new ArrayList<>();
        backTrack(nums,0,subset);
        return res;
    }
    public void backTrack(int nums[],int index,List<Integer>subset){
       res.add(new ArrayList<>(subset));
       for(int i=index;i<nums.length;i++){
            //include
            subset.add(nums[i]);
            // backtrack
            backTrack(nums,i+1,subset);
            //exclude
            subset.remove(subset.size()-1);
       }  
    }
}
