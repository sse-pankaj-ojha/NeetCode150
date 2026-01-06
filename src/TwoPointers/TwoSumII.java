package TwoPointers;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//167. Two Sum II - Input Array Is Sorted
public class TwoSumII {
    static void main() {
        int[] numbers = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end  = numbers.length-1;

        int[] res  = new int[2];
        while (start<end){
            int sum = numbers[start] +numbers[end];
            if( sum == target){
                res[0] = start++;
                res[1] = end++;
                return res;
            }else if(sum<target){
                start++;
            }else{
                end--;
            }
        }
        return res;
    }
}
