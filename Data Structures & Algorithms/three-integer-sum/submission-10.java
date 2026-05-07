class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort first, then loop i for only the negative numbers, 
        // move r only when we have found a valid 3sum
        Arrays.sort(nums);
        int index = 0;
        List<List<Integer>> ans = new ArrayList<>();
        while (index < nums.length && nums[index] <= 0) {
            if (index > 0 && nums[index] == nums[index - 1]) {
                index++;
                continue;
            }
            int l = index+1;
            int r = nums.length-1;
            while (l < r) {
                int sum = (nums[l] + nums[r] + nums[index]);
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[index], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;

                } else if ( sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
            index++;
        }
        return ans;
    }
}
