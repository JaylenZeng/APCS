/*

We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
*/
public class isEverywhere {
    public static boolean isEverywhere(int[] nums, int val) {
        int there = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == val || nums[i+1] == val) {
                there++;
            }
        }
        return there >= nums.length-1;

    }
    public static void main(String[] args) {
        System.out.println(isEverywhere(new int[] {1,2,1,3}, 1));
    }
    
}
