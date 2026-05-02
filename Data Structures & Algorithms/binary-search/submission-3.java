class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l<=r) {
            int mid = (l+r)/2;
            int midNum = nums[mid];
            if (midNum == target) {
                return mid;
            }
            if (midNum < target) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return -1;
    }
}
