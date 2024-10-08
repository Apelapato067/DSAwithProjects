class Solution {
    public int minLength(String s) {
        // Create a stack (deque) to keep track of characters.
        Deque<Character> stk = new ArrayDeque<>();
        // Push a dummy character to handle edge cases when the stack is empty.
        stk.push(' ');
        
        // Iterate over each character in the string.
        for (char c : s.toCharArray()) {
            // If the current character 'c' forms the pair "AB" or "CD" with the top of the stack,
            // remove the top character from the stack (reduce the string).
            if ((c == 'B' && stk.peek() == 'A') || (c == 'D' && stk.peek() == 'C')) {
                stk.pop();
            } else {
                // Otherwise, push the current character onto the stack.
                stk.push(c);
            }
        }
        
        // Return the size of the stack minus the dummy character (to get the final reduced length).
        return stk.size() - 1;
    }
}
