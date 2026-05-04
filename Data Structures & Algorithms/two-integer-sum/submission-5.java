class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (hashMap.containsKey(needed)) {
                return new int[]{hashMap.get(needed), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return null;
    }
}
