class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile:piles) {
            maxPile = Math.max(pile, maxPile);
        }

        int l = 1;
        int r = maxPile;
        int ans = 0;
        while (l<=r) {
            if (canEatBanana(piles, h, (l+r)/2)) {
                ans = (l+r)/2;
                r = (l+r)/2 - 1;
            } else {
                l = (l+r)/2 + 1;
            }
        }
        return ans;
    }
    public boolean canEatBanana(int[] piles, int h, int k) {
        long hours = 0; // Use long to prevent overflow
            for (int pile : piles) {
        hours += (long)(pile + k - 1) / k; 
        }
        return hours <= h;
    }
}
