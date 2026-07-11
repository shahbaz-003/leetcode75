import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            // Collision occurs only when:
            // Top of stack is moving right (+)
            // Current asteroid is moving left (-)
            while (!stack.isEmpty()
                    && stack.peek() > 0
                    && asteroid < 0) {

                // Top asteroid is smaller
                if (stack.peek() < -asteroid) {
                    stack.pop();
                }

                // Both are equal
                else if (stack.peek() == -asteroid) {
                    stack.pop();
                    destroyed = true;
                    break;
                }

                // Top asteroid is larger
                else {
                    destroyed = true;
                    break;
                }
            }// while loop ends here 

            // If current asteroid survives, push it
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();//we use this loop to store stack elements in array result
        }

        return result;
    }
}