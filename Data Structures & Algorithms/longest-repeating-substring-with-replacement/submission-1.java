class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, res = 0, maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            while ((r - l + 1) - maxFreq > k) {
    char leftChar = s.charAt(l);
    map.put(leftChar, map.get(leftChar) - 1);
    l++;
}

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
