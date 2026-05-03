class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // value, index
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums2.length; i++) {
            hashMap.put(nums2[i], i);
        }
        int[] ans = new int[nums1.length];
        for (int j = 0; j < nums1.length; j++) {
            int index = hashMap.get(nums1[j]);
            while (index < nums2.length && nums2[index] <= nums1[j]) {
                index++;
            }
            if (index == nums2.length) {
                ans[j] = -1;
            } else {
                ans[j] = nums2[index];
            }
        }
        return ans;
    }
}