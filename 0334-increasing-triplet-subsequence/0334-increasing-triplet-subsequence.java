class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            
            // Step 1: Update smallest number
            if (num <= first) {
                first = num;
            } 
            
            // Step 2: Update second smallest number
            else if (num <= second) {
                second = num;
            } 
            
            // Step 3: If we find a number greater than both
            else {
                return true;
            }
        }

        return false;
    }
}