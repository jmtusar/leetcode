class Solution {
    public int jump(int[] nums) {
        int steps = 0;
    int maxReach = 0;
    int lastJumpMaxReach = 0;

    for (int i = 0; i < nums.length - 1; ++i) {
        maxReach = Math.max(maxReach, i + nums[i]);

        if (lastJumpMaxReach == i) {
            steps++;
            lastJumpMaxReach = maxReach;

            if (maxReach >= nums.length - 1) {
                break;
            }
        }
    }

    return steps;

    }
}
