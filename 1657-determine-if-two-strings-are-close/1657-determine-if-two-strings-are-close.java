import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {

        // If lengths are different, they can never be close
        if (word1.length() != word2.length()) {
            return false;
        }

        // Frequency arrays for 26 lowercase letters
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count frequency of each character
        for (char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
        }

        // Check if both strings contain the same set of characters
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) ||
                (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        // Sort the frequency arrays
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Compare sorted frequencies
        return Arrays.equals(freq1, freq2);
    }
}