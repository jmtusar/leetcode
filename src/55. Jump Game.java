class Solution {
    public boolean canJump(int[] nums) {
        int current = 0;
        if(nums.length == 1){
            return true;
        }
        if(nums.length>1 && nums[0] == 0){
            return false;
        }
        for(int i = 0; i<nums.length;i++){
            if (i> current){
                return false;
            }
            current = Math.max(current,i+nums[i]);
            if(current>=nums.length-1){
                return true;
            }
        }
        return true;
    }
}
