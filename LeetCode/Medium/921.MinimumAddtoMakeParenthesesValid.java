class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stk = new ArrayDeque<>(); // Stack to store parentheses
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If current character is ')' and the stack has '(' on top, pop the stack (valid pair)
            if (c == ')' && !stk.isEmpty() && stk.peek() == '(') {
                stk.pop();
            } else {
                stk.push(c); // Push current character to stack
            }
        }
        // Return the size of the stack (unmatched parentheses)
        return stk.size();
    }
}
