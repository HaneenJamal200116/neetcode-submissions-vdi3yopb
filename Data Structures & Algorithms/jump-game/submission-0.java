class Solution {
    public boolean canJump(int[] nums) {
        int finalPos=nums.length-1;
        for(int index=nums.length-2;index>=0;index--){
            if(index + nums[index]>=finalPos){
                finalPos=index;
            }
        }
        return finalPos==0;
    }
}
