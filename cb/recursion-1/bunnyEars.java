
// We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class bunnyEars {
    public static int bunnyEars(int bunnies) {
        int ret = 0;
        if (bunnies == 0) {
            return 0;
        }
        else {
            ret += bunnyEars(bunnies-1) + 2;
        }
        return ret;
        
    }   
    public static void main(String[] args) {
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(3));
        System.out.println(bunnyEars(5));
        System.out.println(bunnyEars(50));

    }
}