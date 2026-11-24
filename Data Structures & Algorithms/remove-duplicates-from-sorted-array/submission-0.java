class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            nums[i]=nums[j];
            while(j<nums.length && nums[i]==nums[j]){
                j++;
            }
            i++;
            
        }

        return i;
    }
}