
import java.util.Scanner;

public class Solution {

    public static int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        // Find the minimum and maximum possible capacity
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        // Binary search on capacity
        while (left < right) {

            int mid = left + (right - left) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            // Calculate days needed for this capacity
            for (int weight : weights) {

                if (currentWeight + weight > mid) {
                    requiredDays++;
                    currentWeight = 0;
                }

                currentWeight += weight;
            }

            // Check whether this capacity is valid
            if (requiredDays <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
