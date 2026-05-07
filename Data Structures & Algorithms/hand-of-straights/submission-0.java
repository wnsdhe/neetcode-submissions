class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int num : hand) {
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }
        for (int num : hand) {
            // Skip if this card was already used as part of another group
            if (hashMap.get(num) == 0) {
                continue;
            }

            // Try to form a group starting from 'num'
            for (int i = 0; i < groupSize; i++) {
                int add = num + i;
                
                // Check if the next consecutive card exists
                if (!hashMap.containsKey(add) || hashMap.get(add) == 0) {
                    return false;
                }
                
                // IMPORTANT: Update 'add', not 'num'
                hashMap.put(add, hashMap.get(add) - 1);
            }
        }
        return true;
    }
}