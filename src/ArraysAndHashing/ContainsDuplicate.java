package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/description/
//217. Contains Duplicate
public class ContainsDuplicate {
    static void main() {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));

        nums = new int[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));

        nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for(int i : nums){
            if(!integerSet.add(i)){
                return true;
            }
        }
        return false;
    }
}
