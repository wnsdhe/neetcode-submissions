class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap<Integer, Integer> prefixHashMap = new HashMap();
        HashMap<Integer, Integer> postfixHashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int prevProduct = prefixHashMap.getOrDefault(i-1, 1);
            prefixHashMap.put(i, prevProduct*nums[i]);
        }
        // this is wrong because the indexing is wrong. Do I need to go back to stringBuilder?

        for (int j = nums.length - 1; j >= 0; j--) {
            int prevProduct = postfixHashMap.getOrDefault(j+1, 1);
            postfixHashMap.put(j, prevProduct * nums[j]);
        }
        System.out.println(prefixHashMap);
        System.out.println(postfixHashMap);
        int[] ans = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            ans[index] = prefixHashMap.getOrDefault(index - 1, 1) * postfixHashMap.getOrDefault(index + 1, 1);
        }
        return ans;

    }
}  
