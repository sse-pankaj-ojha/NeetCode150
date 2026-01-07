package SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-repeating-character-replacement/description/
//424. Longest Repeating Character Replacement
//https://www.youtube.com/watch?v=ExY8svHF_Eo
public class LongestRepeating {
    static void main() {
        String s = "ABAB";
        int k = 2;

        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {

        int maxFreq = 0;
        int maxLen = 0;
        int left = 0;

        int[] freq = new int[26];

        for(int right = 0; right <s.length();right++){
            char ch = s.charAt(right);
            freq[ch-'A']++;

            maxFreq = Math.max(maxFreq, freq[ch-'A']);

            int window = right - left + 1;

            if(window - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            window = right - left + 1;
            maxLen = Math.max(maxLen, window);
        }

        return maxLen;

    }
}
