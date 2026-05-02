class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numCount = new HashMap();
        for (int i : nums) {
            Integer count = numCount.getOrDefault(i, 0);
            numCount.put(i, count+1);
        }
        List<Integer>[] resultCount = new List[nums.length+1];
        for(int i = 0; i < resultCount.length; i++) {
            resultCount[i] = new ArrayList();
        }
        numCount.forEach((key, value) -> {
            resultCount[value].add(key);
        });
        int[] ans = new int[k];
        int index = 0;
        for (int j = resultCount.length - 1; j >= 0 && index < k; j--) {
            for (int num: resultCount[j]) {
                ans[index] = num;
                index++;
                if (index == k) {return ans;}
            }
        }
        return ans;
    }
}
