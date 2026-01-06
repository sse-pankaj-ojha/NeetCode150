package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-consecutive-sequence/description/
//128. Longest Consecutive Sequence
public class LongestSequence {
    static void main() {
        int[]  nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int maxLen = 0;

        for(int ele: set){
            int prev = ele - 1;
            if(!set.contains(prev)){
                int len = 1;
                int next = ele + 1;
                while (set.contains(next)){
                    len++;
                    next += 1;
                }
                maxLen = Math.max(maxLen, len);

            }
        }
        return maxLen;

    }
}
