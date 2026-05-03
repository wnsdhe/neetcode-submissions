class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList> hashMap = new HashMap();
        for (String str : strs) {
            int[] chars = new int[26];
            for (char c : str.toCharArray()) {
                chars[c-'a'] += 1;
            }
            //Arrays.toString(chars) THIS IS NEEDED because chars.toString will give you mem address
            ArrayList<String> temp = hashMap.getOrDefault(Arrays.toString(chars), new ArrayList<String>());
            temp.add(str);
            hashMap.put(Arrays.toString(chars), temp);
        }
        return new ArrayList(hashMap.values());
    }
}
