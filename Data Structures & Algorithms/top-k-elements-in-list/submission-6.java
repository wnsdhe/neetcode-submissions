class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            int tempNum = hashMap.getOrDefault(num, 0);
            hashMap.put(num, tempNum+1);
        }
        // ArrayList<Integer>[] counts = new ArrayList[nums.length+1];
        // for (int i = 0; i < counts.length; i++) {
        //     counts[i] = new ArrayList<Integer>();
        // }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        hashMap.forEach(
            (number, occurances) -> {
                maxHeap.offer(new int[]{number, occurances});
            }
        );
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = maxHeap.poll()[0];
        }
        return ans;
    }
}
