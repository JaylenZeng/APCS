/*
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
*/

public class sum67 {
  public int sum67(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 6) {
        sum += nums[i];
      } else {
        while (nums[i] != 7) {
          i++;
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(new int[] { 2, 3, 2, 2, 4, 2 });
  }
}
