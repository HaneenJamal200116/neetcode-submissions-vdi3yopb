class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(map.containsKey(res)){
                arr[1]=i;
                arr[0]=map.get(res);
            }
            map.put(nums[i],i);
        } 
        return arr;

    }
}
