import java.util.*;

public class Solution {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has occurred once
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            // Calculate prefix sum
            sum = sum + num;

            // Find the previous prefix sum we need
            int required = sum - k;

            // If required sum exists
            if (map.containsKey(required)) {
                count = count + map.get(required);
            }

            // Store/update current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}