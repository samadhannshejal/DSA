class Solution {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length - 1;
    int maxReachableIndex = 0;
    for (int i = 0; i <= maxReachableIndex && maxReachableIndex < lastIndex; i++) {
        maxReachableIndex = Math.max(maxReachableIndex, i + nums[i]);
    }
    return maxReachableIndex >= lastIndex;
    }
}