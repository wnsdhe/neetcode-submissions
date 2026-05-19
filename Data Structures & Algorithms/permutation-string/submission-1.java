class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1HashMap = new HashMap();
        for (Character c : s1.toCharArray()) {
            int temp = s1HashMap.getOrDefault(c, 0);
            s1HashMap.put(c, temp+1);
        }
        for (int i = 0; i <= s2.length()-s1.length(); i++) {
            if (s1HashMap.get(s2.charAt(i)) != null) {
                HashMap<Character, Integer> s2HashMap = new HashMap();
                for (char c : s2.substring(i, i+s1.length()).toCharArray()) {
                    int temp = s2HashMap.getOrDefault(c, 0);
                    s2HashMap.put(c, temp+1);
                }
                if (s1HashMap.entrySet().equals(s2HashMap.entrySet())) {
                    return true;
                }
            }
        }
        return false;
    }
}
