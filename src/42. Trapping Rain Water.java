class Solution {
    public int trap(int[] height) {
    int i = 0;
    int j = height.length - 1;
    int maxl = 0;
    int maxr = 0;
    int res = 0;
    while (i < j) {
        maxl = Math.max(maxl, height[i]);
        maxr = Math.max(maxr, height[j]);
        if (maxl < maxr) {
            res += maxl - height[i];
            i++;
        } else {
            res += maxr - height[j];
            j--;
        }
    }
    return res;

    }
}
