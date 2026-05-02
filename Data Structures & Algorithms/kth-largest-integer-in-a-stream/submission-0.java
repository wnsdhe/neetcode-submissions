class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private Integer k;

    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<>();
        for (int num : nums) {
            this.minHeap.offer(num);
            while (this.minHeap.size() > k) {
                this.minHeap.poll();
            }
        }
        this.k = k;
    }
    
    public int add(int val) {
        if (this.minHeap.size() < k) {
            this.minHeap.offer(val);
            return this.minHeap.peek();
        }
        this.minHeap.offer(val);
        while (this.minHeap.size() > k) {
            this.minHeap.poll();
        }
        return this.minHeap.peek();
    }
}
