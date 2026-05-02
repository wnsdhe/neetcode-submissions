class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while(maxHeap.size() > 1) {
            int stoneA = maxHeap.poll();
            int stoneB = maxHeap.poll();
            int resultStone = Math.abs(stoneA - stoneB);
            if (resultStone == 0) {
                continue;
            }
            maxHeap.offer(resultStone);
        }
        if (maxHeap.size() == 0) {
            return 0;
        }
        return maxHeap.poll();
    }
}
