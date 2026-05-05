class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int ans = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            while (hashSet.contains(s.charAt(r))) {
                hashSet.remove(s.charAt(l));
                l++;
            }
            hashSet.add(s.charAt(r));
            System.out.println(hashSet);
            ans = Math.max(ans, r-l+1);
            System.out.println(ans);
        }
        return ans;
    }
}
