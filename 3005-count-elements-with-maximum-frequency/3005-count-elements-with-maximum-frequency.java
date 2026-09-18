import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxfreq = 0;
        int ans = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int freq = entry.getValue();

            if (maxfreq < freq) {
                maxfreq = freq;
                ans = freq;
            }
            else if (maxfreq == freq) {
                ans = ans + freq;
            }
        }

        return ans;
    }
}