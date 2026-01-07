package SlidingWindow;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/permutation-in-string/
//567. Permutation in String
public class StringPermutations {
    static void main() {
        //String s1 = "abc", s2 = "bbbca";
        String s1 = "ab", s2 = "eidbaooo";
        //String s1 = "ab", s2 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        int[] s1freq = new int[26];

        // frequency of s1
        for (char c : s1.toCharArray()) {
            s1freq[c - 'a']++;
        }


        int window = s1.length();
        for(int i = 0;i<s2.length();i++){
            int windIdx = 0;
            int idx = i;

            int[] s2freq = new int[26];

            while (windIdx < window && idx < s2.length()){
                s2freq[s2.charAt(idx) - 'a']++;
                idx++;
                windIdx++;
            }

            if(Arrays.equals(s1freq, s2freq)) return true;
        }
        return false;

    }
}
