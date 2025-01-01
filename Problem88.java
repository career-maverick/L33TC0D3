public class Problem88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
        
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int mergeIndex = m + n - 1;
       int nums1Index = m - 1;
       int nums2Index = n - 1;

       while (nums1Index >= 0 && nums2Index >= 0) {
           if (nums1[nums1Index] > nums2[nums2Index]) {
               nums1[mergeIndex] = nums1[nums1Index];
               nums1Index--;
           } else {
               nums1[mergeIndex] = nums2[nums2Index];
               nums2Index--;
           }
           mergeIndex--;
       }

       while (nums2Index >= 0) {
           nums1[mergeIndex] = nums2[nums2Index];
           nums2Index--;
           mergeIndex--;
       }
    }
}