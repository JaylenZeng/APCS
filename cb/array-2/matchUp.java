//Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

public class matchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        int ctr = 0;
        int diff;
        for (int i = 0; i < nums1.length; i++) {
            diff = nums1[i] - nums2[i];
            if (diff < 0) {
                diff = diff * -1;
            }
            if (diff <= 2) {
                if (diff != 0) {
                    ctr++;
                }
            }
        }
        return ctr;
    }
}
