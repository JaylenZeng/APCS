/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
You may assume that the array is length 3 or more.
*/
public class centeredAverage {
  public int centeredAverage(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] <= min) {
        min = nums[i];
      }
      else {
        if (nums[i] > max) {
            max = nums[i];
        }
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == min) {
        nums[i] = 0;
        i = nums.length;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == max) {
        nums[i] = 0;
        i = nums.length;
      }
    }
    for (int num : nums) {
      sum += num;
    }
    return sum/(nums.length-2);
  }
}
