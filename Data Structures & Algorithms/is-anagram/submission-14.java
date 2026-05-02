class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> characters = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            characters.put(s.charAt(i), characters.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int j = 0; j < s.length(); j++) {
            if (!characters.containsKey(t.charAt(j)) || characters.get(t.charAt(j)) == 0) {
                return false;
            }
            characters.put(t.charAt(j), characters.get(t.charAt(j))-1);
            
        }
        return true;
    }
}
