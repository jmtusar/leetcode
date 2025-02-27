class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        int start = 1;
        int ret = 0;
        int cur = 0;
        int[] position = new int[128];

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);

            if (position[c] >= start) {
                start = position[c] + 1;
                cur = i + 2 - start;
            } else {
                cur += 1;
                ret = Math.max(ret, cur);
            }
            position[c] = i + 1;
        }
        return ret;
    }
}
