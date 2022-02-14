public class Factorial {
    public int factorial(int n) {
        int ret = n;
        if (n != 1) {
            ret *= factorial(n - 1);
        } 
        return ret;

    }

} // end class