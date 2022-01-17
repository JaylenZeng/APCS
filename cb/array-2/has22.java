public class has22 {
    public boolean has22(int[] nums) {
        boolean twotwo = false;
        for (int i = 0 ; i < nums.length-1 ; i++) {
          if (nums[i] == 2) {
            twotwo = (nums[i+1] == 2);
          }
          if (twotwo == (true)) {
            i = nums.length;
          }
        }
        return twotwo;
      }
}
