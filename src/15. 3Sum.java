class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        int n = num.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (num[i] > 0) break; 
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = num[i] + num[l] + num[r];
                if (sum < 0) l++;
                else if (sum > 0) r--;
                else {
                    ans.add(Arrays.asList(num[i], num[l], num[r]));
                    while (l+1 <= r && num[l] == num[l+1]) l++;
                    l++;
                    r--;
                }
            }
            while (i+1 < n && num[i+1] == num[i]) i++; 
        }
        return ans;
    }
}
