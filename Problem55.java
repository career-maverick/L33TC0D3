public class Problem55 {

    private static boolean canJump(int[] nums) {
        int maxReach = 0;

        for(int index =0; index<nums.length;index++){
            if (index > maxReach) return false;
            maxReach = Math.max(maxReach, index+nums[index]);
            if (maxReach>= nums.length-1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {2,3,1,1,4};
        System.out.println(canJump(input));
    }
}
