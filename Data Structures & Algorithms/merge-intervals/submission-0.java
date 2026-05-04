class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList();
        int[] currentLargestInterval = intervals[0];
        for (int[] interval: intervals) {
            if (interval[0] <= currentLargestInterval[1]) {
                if (interval[1] > currentLargestInterval[1]) {
                    currentLargestInterval = new int[]{currentLargestInterval[0], interval[1]};
                }
            } else {
                ans.add(currentLargestInterval);
                currentLargestInterval = interval;
            }
        }
        ans.add(currentLargestInterval);
        return ans.toArray(new int[0][]);
    }
}
