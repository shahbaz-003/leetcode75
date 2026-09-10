import java.util.*;

public class Solution {

    public static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Put all elements into HashSet
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        // Check every number
        for (int num : set) {

            // Start only if num is the beginning
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Find consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}