class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count all number times each num show up
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            int count = hashMap.getOrDefault(num, 0);
            hashMap.put(num, count+1);
        }
        // Add it to an Array of Lists where aray is the number of times each number shows up
        List<Integer>[] countList = new List[nums.length+1];
        for (int a = 0; a<nums.length+1; a++) {
            countList[a] = new ArrayList();
        }
        hashMap.forEach((key, value) -> {
            countList[value].add(key);
        });
        int[] ans = new int[k];
        int count = 0;
        for (int i = countList.length - 1; i >= 0 && count < k; i--) {
            for (int number : countList[i]) {
                ans[count] = number;
                count++;
                if (count == k) {
                    return ans;
                }
            }
        }
        return ans;
    }
}
