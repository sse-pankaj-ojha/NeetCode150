package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//3. Longest Substring Without Repeating Characters
public class LongestSubstring {
    static void main() {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        ArrayList<Character> list = new ArrayList<>();
        int maxLen = 0;

        int start = 0;
        int end = 0;

        while (end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
            maxLen = Math.max(maxLen, list.size());
        }
        return maxLen;

    }
}
