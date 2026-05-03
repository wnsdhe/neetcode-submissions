class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for (int num : nums) {
            maxHeap.offer(num);
        }
        int ans = -1;
        for(int i=0; i<k; i++) {
            ans = maxHeap.poll();
        }
        return ans;
    }
}
