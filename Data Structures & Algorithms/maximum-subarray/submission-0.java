class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;
        if (nums.length ==1) {
            return nums[0];
        }
        for (int num : nums) {
            if (curSum<0) {
                curSum = 0;
            } 
            curSum = curSum+num;
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
