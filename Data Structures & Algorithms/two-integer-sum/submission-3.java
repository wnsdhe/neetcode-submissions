class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        int index = 0;
        while(index <= nums.length) {
            int numNeeded = target - nums[index];
            if (hashMap.containsKey(numNeeded)) {
                return new int[]{hashMap.get(numNeeded), index};
            }
            hashMap.put(nums[index], index);
            index++;
        }
        return null;
    }
}
