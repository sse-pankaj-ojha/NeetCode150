package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/description/
//1. Two Sum
public class TwoSum {
    static void main() {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i =0;i<nums.length;i++){
            int diff = target - nums[i] ;
            if(map.containsKey(diff)){
                res[1] = i;
                res[0] = map.get(diff);
            }else{
                map.put(nums[i], i);
            }
        }
        return res;

    }
}
