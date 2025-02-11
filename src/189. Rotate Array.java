class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k = k%nums.length;
        }
        revArray(nums, 0, nums.length-1);
        revArray(nums, 0, k-1);
        revArray(nums, k, nums.length-1);

    }
    public void revArray(int[] nums, int start, int end){
        while(start<end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
