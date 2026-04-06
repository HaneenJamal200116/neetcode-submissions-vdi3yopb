class Solution {
    public int[] productExceptSelf(int[] nums) { 
        int arr[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        int res=1;
        for(int j=0;j<nums.length;j++){
            if(i==j) continue;
            res*=nums[j];
        }
        arr[i]=res;
       }
       return arr;
    }
}  
