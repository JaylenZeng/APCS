// Given an array of ints, return true if it contains no 1's or it contains no 4's
public class no14 {
    public boolean no14(int[] nums) {
        boolean _one = true;
        boolean _four = true;
        for (int num : nums) {
            if (num == 1) {
                _one = false;
            }
            if (num == 4) {
                _four = false;
            }
        }
        return (_one || _four);
    }
    
}
