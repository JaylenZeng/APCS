// Given an array of ints, return true if the number of 1's is greater than the number of 4's.
public class more14 {
    public static boolean more14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones++;
            }
            if (nums[i] == 4) {
                fours++;
            }
        }
        return ones > fours;
    }

    public static void main(String[] args) {
        System.out.print(new int[] { 1, 4, 1 });
        System.out.print(new int[] { 1, 4, 1, 4 });
        System.out.print(new int[] {1, 1});
        System.out.print(new int[] {1, 6, 6});


    }
}
