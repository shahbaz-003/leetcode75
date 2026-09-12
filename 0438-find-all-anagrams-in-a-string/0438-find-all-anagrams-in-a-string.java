public class Solution {

    static List<Integer> findAnagrams(String s, String p) {

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        List<Integer> result = new ArrayList<>();

        // Count characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        // Sliding window
        for (int i = 0; i < s.length(); i++) {

            // Add current character
            sCount[s.charAt(i) - 'a']++;

            // Remove character outside the window
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            // Compare when window size becomes p.length()
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}