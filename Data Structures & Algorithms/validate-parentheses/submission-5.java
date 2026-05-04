class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }
        HashSet<Character> pushSet = new HashSet<>();
        pushSet.add('(');
        pushSet.add('{');
        pushSet.add('[');
        Stack<Character> stack = new Stack();
        for (char character : s.toCharArray()) {
            if (pushSet.contains(character)) {
                if ('(' == character) {
                    stack.push(')');
                }
                if ('{' == character) {
                    stack.push('}');
                }
                if ('[' == character) {
                    stack.push(']');
                }
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if (stack.pop() != character) {
                    return false;
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}
