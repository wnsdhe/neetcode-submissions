class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashM = new HashMap();
        for(String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a'] += 1;
            }
            List<String> tempList = hashM.getOrDefault(Arrays.toString(count), new ArrayList());
            tempList.add(s);
            hashM.put(Arrays.toString(count), tempList);
        }
        return new ArrayList<>(hashM.values());
    }
}
