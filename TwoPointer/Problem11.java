package TwoPointer;

/**
 * Problem 11 leetcode
 * You are given an integer array height of length n. There are n vertical lines drawn 
 * such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * 
 * Find two lines that together with the x-axis form a container, 
 * such that the container contains the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Notice that you may not slant the container.
 * 
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * 
 * https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg
 * 
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
 * In this case, the max area of water (blue section) the container can contain is 49.
 * 
 * 
 */

public class Problem11 {

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int [] height){

        if (height.length==0 || height.length<2) {
            return 0;
        }

        int maxArea =0;
        int left =0;
        int right = height.length-1;

        while (left<right) {
            int width = right-left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width*minHeight;
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right]) {
                left++;
            } else{
                right--;
            }
        }
        return maxArea;
    }
}
