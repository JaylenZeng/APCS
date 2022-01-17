// Given an array of ints, return true of every element is a 1 or a 4.
public class only14 {
    public static boolean only14(int[] nums) {
        boolean yes = true;
        for (int num : nums) {
            if (num != 4) {
                if (num != 1) {
                    yes = false;
                }
            }
        }
        return yes;
    }

    public static void main(String[] args) {
        System.out.println(only14(new int[] { 1, 4, 1, 4 }));
        System.out.println(only14(new int[] { 1, 4, 2, 4 }));
        System.out.println(only14(new int[] { 1, 1 }));
        System.out.println(only14(new int[] { 4, 1 }));

    }
}
