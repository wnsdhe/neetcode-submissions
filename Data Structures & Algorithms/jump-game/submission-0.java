class Solution {
    public boolean canJump(int[] nums) {
        int goalIndex = nums.length-1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (goalIndex <= i+nums[i]) {
                goalIndex = i;
            }
            continue;
        }
        return (goalIndex == 0);
    }
}
