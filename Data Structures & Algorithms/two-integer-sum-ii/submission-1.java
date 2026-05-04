class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int needed;
        outerLoop:
        for (int num = 0; num < numbers.length ; num++) {
            needed = target - numbers[num];
            System.out.println(needed);
            for (int i = numbers.length-1; i >- 0; i--) {
                if (numbers[i] < needed) {
                    continue outerLoop;
                }
                if (numbers[i] == needed) {
                    return new int[] { num + 1, i + 1 };
                }
            }
        }
        return null;
    }
}
