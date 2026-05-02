class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap hashNums = new HashMap();
        for (int num: nums) {
            if (hashNums.containsKey(num)) {
                return true;
            }
            hashNums.put(num,1);
        }
        return false;
    }
}