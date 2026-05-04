class Solution {
    public int longestConsecutive(int[] nums) {
        // NEED to create hashSet of all NUMS
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxCount = 0;
        for (int num: nums) {
            int count = 0;
            if (!set.contains(num-1)) {
                int nextNum = num;
                while (set.contains(nextNum)) {
                    count++;
                    maxCount = Math.max(count,maxCount);
                    nextNum += 1;
                }
            }
        }
        return maxCount;
    }
}
