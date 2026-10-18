class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0, j = 0;
        int cnt = 0;
        HashSet<Character> set = new HashSet<>();
        while (j < s.length()) {
            char chI = s.charAt(i);
            char chJ = s.charAt(j);

            if (!set.contains(chJ)) {
                set.add(chJ);
                j++;
                max = Math.max(max, set.size());

            } else {
                set.remove(chI);
                i++;
            }
        }

        return max;
    }
}
