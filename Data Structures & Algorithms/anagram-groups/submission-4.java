class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str: strs) {
            int[] chars = new int[26];
            for (char character : str.toCharArray()) {
                chars[character-'a']+=1;
            }
            String key = Arrays.toString(chars);
            List temp = hashMap.getOrDefault(key, new ArrayList<String>());
            temp.add(str);
            hashMap.put(key, temp);
        }
        return new ArrayList(hashMap.values());
    }
}
