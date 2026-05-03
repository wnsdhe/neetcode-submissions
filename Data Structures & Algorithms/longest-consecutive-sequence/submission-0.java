class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet();
        int longest = 0;
        for (int num : nums) {
            hashSet.add(num);
        }
        for (int num : hashSet) {
            if (!hashSet.contains(num-1)) {
                int tempNum = num;
                int tempLongest = 0;
                while (hashSet.contains(tempNum)) {
                    tempNum = tempNum+1;
                    tempLongest += 1;
                    longest = Math.max(longest, tempLongest);
                }
            }
        }
        return longest;
    }
}
