/*TEAM NAME: INCREDIBLY COHESIVE
*/
import java.math.*;
import java.util.Arrays;
public class Loopier {
  public static int[] paul = new int[10];
  public static void populateArray(int[] a) {
    int i = 0;
    int x;
    while (i < 10) {
      x = (int) (Math.random() * 100);
      paul[i] = x;
      i ++;
    }
  }
  public String printArray(int[] a) {
    
  }
  public static void main(String[] args) {
    populateArray(paul);
    System.out.println(Arrays.toString(paul));
  }

}
