package TwoPointers;

//https://leetcode.com/problems/trapping-rain-water/description/
//42. Trapping Rain Water
public class TrappingRainWater {
    static void main() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int leftMax = 0, rightMax = 0;

        int res  = 0;

        while (start < end){
            if(height[start] < height[end]){
                if((height[start]  >= leftMax)) leftMax = height[start];
                res += leftMax - height[start];
                start++;
            } else{
                if((height[end]  >= rightMax)) rightMax = height[end];
                res += rightMax - height[end];
                end--;
            }
        }
        return res;
    }
}
