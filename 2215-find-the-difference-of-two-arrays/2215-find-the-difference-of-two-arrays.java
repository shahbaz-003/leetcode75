import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        // Store unique elements of nums1
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Store unique elements of nums2
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        // List for elements in nums1 but not in nums2
        List<Integer> list1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        // List for elements in nums2 but not in nums1
        List<Integer> list2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        // Final answer
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);

        return answer;
    }
} 