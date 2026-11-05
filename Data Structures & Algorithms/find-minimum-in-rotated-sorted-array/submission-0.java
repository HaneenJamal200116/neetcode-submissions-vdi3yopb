class Solution {
    public int findMin(int[] nums) {
        int res=nums[0];
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[r] > nums[l]) {
                res = Math.min(res, nums[l]);
                break;
            }
            int mid = (l + r) / 2;
            res=Math.min(res,nums[mid]);
            if(nums[mid]>=nums[l]){ // check right side 
                l=mid+1;
            }
            else{  // check left side
                r=mid-1;
            }
            
            
        }
        return res;
    }
}
