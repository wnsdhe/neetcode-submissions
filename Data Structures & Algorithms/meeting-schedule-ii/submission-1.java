/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a,b) -> a.start - b.start);
        int max = 0;
        PriorityQueue<Integer> roomsCurrentlyInUse = new PriorityQueue<>();
        for (Interval meeting : intervals) {
            if (!roomsCurrentlyInUse.isEmpty() && roomsCurrentlyInUse.peek() <= meeting.start) {
                roomsCurrentlyInUse.poll();
            }
            roomsCurrentlyInUse.offer(meeting.end);
            max = Math.max(max, roomsCurrentlyInUse.size());
        }
        return max;
    }
}
