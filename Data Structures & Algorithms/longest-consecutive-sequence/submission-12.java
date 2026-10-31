class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if (nums.length == 0)
            return 0;
        for (int num : nums) set.add(num);
        int cnt = 1, max = 1;
        for (int num : nums) {
            int curr = num;

            if (!set.contains(curr - 1)) {
                while (set.contains(curr + 1)) {
                    curr = curr + 1;
                    cnt++;
                }
            }

            max = Math.max(cnt, max);

            cnt = 1;
        }
        return max;
    }
}
