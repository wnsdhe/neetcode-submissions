class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> 
            (int)(Math.pow(a[0],2)+Math.pow(a[1],2)) - (int)(Math.pow(b[0],2)+Math.pow(b[1],2))
        );
        for (int[] point : points) {
            minHeap.offer(point);
        }
        List<int[]> ans = new ArrayList();
        for (int i = 0; i < k; i++) {
            ans.add(minHeap.poll());
        }
        return ans.toArray(new int[ans.size()][]);
    }
}

