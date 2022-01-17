// Given an array of ints, return true if the number of 1's is greater than the number of 4's.
public class fizzArray {
    public static int[] fizzArray(int n) {
        int[] bill = new int[n];
        for (int i = 0; i < bill.length; i++) {
            bill[i] = i;
        }
        return bill;
    }

    public static void main(String[] args) {
        System.out.println(fizzArray(4));
        System.out.println(fizzArray(0));
        System.out.println(fizzArray(10));
        System.out.println(fizzArray(0));
        System.out.println(fizzArray(2));
        System.out.println(fizzArray(7));

    }
}
