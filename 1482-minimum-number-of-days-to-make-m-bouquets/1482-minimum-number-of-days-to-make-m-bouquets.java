
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // Check if enough flowers are available
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int left = bloomDay[0];
        int right = bloomDay[0];

        // Find minimum and maximum blooming days
        for (int i = 1; i < bloomDay.length; i++) {
            left = Math.min(left, bloomDay[i]);
            right = Math.max(right, bloomDay[i]);
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int bouquets = 0;
            int consecutive = 0;

            // Count bouquets possible by day mid
            for (int i = 0; i < bloomDay.length; i++) {

                if (bloomDay[i] <= mid) {
                    consecutive++;

                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }
                } else {
                    consecutive = 0;
                }
            }

            if (bouquets >= m) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}