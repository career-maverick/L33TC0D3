public class Problem45 {
    private static int canJump(int[] nums) {
        int jumps = 0;
        int maxReach = 0;
        int currentEnd=0;

        for (int index = 0; index < nums.length - 1; index++) { // Stop at second-last index
            maxReach = Math.max(maxReach, index + nums[index]); // Update the farthest reach
            if (index == currentEnd) { // When we reach the end of a jump, we must jump
                jumps++;
                currentEnd = maxReach;
                if (currentEnd >= nums.length - 1) { // If we can reach the last index, stop
                    break;
                }
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 1, 1, 1};
        System.out.println(canJump(input));
    }
}
