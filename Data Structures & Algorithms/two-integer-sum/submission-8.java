class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] pair = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pair[i] = new int[]{nums[i], i};
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));
        int i=0,j=nums.length-1;
        while(j>i){
            int sum=pair[j][0]+pair[i][0];
            // if target=sum
            if(target==sum){
                int idx1 = pair[i][1];
                int idx2 = pair[j][1];
                return new int[]{Math.min(idx1, idx2), Math.max(idx1, idx2)};
            }
            // if target>sum
            else if(target>sum){
                i++;
            }
            // if target<sum
            else{
               j--;
            }
        }
        return new int[]{};
    }
}
