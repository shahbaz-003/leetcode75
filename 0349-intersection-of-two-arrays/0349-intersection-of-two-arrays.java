import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        // Put all elements of nums1 into the Set
        for (int num : nums1) {
            set.add(num);
        }

        // Store common elements
        Set<Integer> result = new HashSet<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Convert Set to int[]
        int[] answer = new int[result.size()];

        int i = 0;
        for (int num : result) {
            answer[i] = num;
            i++;
        }

        return answer;
    }
}