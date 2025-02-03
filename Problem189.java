import java.util.Arrays;

public class Problem189 {
    private static void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length; //if k is greater than length of array, we need to take modulo
        reverse(nums, 0, length-1); //reverse the whole array
        reverse(nums, 0, k-1); //reverse the first k elements
        reverse(nums, k, length-1); //reverse the rest of the elements
        
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 2;
        rotate(nums, k); 
        System.out.println("Rotated array: "+Arrays.toString(nums));       
    }
}
