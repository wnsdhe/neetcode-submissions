class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = 0;
        while (l<=r) {
            int k = (l+r)/2;
            if (canEat(k, h, piles)) {
                ans = k;
                r = k-1;
            } else {
                l = k+1;
            }
        }
        return ans;
    }
    public boolean canEat(int k, int h, int[] piles) {
        int hourCounter = 0;
        for (int pile : piles) {
            //hourCounter += (pile + k - 1) / k;
            hourCounter+=Math.ceil((double) pile/k);
        }
        return hourCounter<=h;
    }
}
