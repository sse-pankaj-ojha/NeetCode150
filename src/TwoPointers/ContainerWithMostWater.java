package TwoPointers;

//https://leetcode.com/problems/container-with-most-water/
//11. Container With Most Water
public class ContainerWithMostWater {
    static void main() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int start  = 0;
        int end = height.length-1;

        int maxArea = 0;

        while (start<end){
            if(height[start] < height[end]){
                maxArea = Math.max(maxArea , ((end - start) * height[start]));
                start++;
            }else {
                maxArea = Math.max(maxArea , ((end - start) * height[end]));
                end--;
            }
        }
        return maxArea;
    }
}
