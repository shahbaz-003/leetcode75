class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 ;
        int max = piles[0];
        
        int ans = max;
        for (int i = 1 ; i < piles.length ; i++) {
            if(piles[i] > max) {
                max = piles[i];
            }
        }
        int right = max ;
        while (left <= right) {
            int mid = left + (right - left) / 2 ;
            long hours = 0 ;
            for (int i = 0 ; i < piles.length ; i++) {

                 hours += (piles[i] + (long) mid - 1) / mid ;
            }
            if (hours <= h) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        
        return ans ;
    }
}