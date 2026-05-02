class Solution {
    public boolean isPalindrome(String s) {
        int midPoint = s.length()/2;
        int leftIndex = 0;
        int rightIndex = s.length()-1;
        while (leftIndex < rightIndex) {
            System.out.println(leftIndex);
            while (leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
            }
            while (leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
            }
            System.out.println(s.charAt(leftIndex));
            System.out.println(s.charAt(rightIndex));
            if (Character.toLowerCase(s.charAt(leftIndex)) != Character.toLowerCase(s.charAt(rightIndex))) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
