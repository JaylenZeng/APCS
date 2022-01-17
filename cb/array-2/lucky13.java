//Given an array of ints, return true if the array contains no 1's and no 3's.
public class lucky13 {
    public static boolean lucky13(int[] nums) {
        boolean yes = true;
        for (int num : nums) {
            if (num == 1 || num == 3) {
                yes = false;
            }
        }
        return yes;
    } // end method
    public static void main(String[] args) {
        int[] nums = {0,2,4};
        System.out.println(lucky13(nums));
        int[] nums1 = {1,2,3};
        System.out.println(lucky13(nums1));
        int[] nums2 = {1,2,4};
        System.out.println(lucky13(nums2));
        int[] nums3 = {2,7,2,8};
        System.out.println(lucky13(nums3));



        
    }

}// end class
