public class count7 {
    public static int count7(int n) {
        int ctr = 0;
        if (n == 0) {
            return 0;
        }
        else {
            if (n % 10 == 7) {
                ctr += count7(n/10) + 1;
            }
            else {
                ctr += count7(n/10);
            }
        }
        return ctr;
    }
    public static void main(String[] args) {
        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(123));
        System.out.println(count7(7123));

    }
    
}
