public class either24 {
    public boolean either24(int[] nums) {
        boolean _twos = false;
        boolean _fours = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) {
                _twos = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                _fours = true;
            }
        }
        if (_twos && _fours) {
            return false;
        } 
        else {
            return _twos || _fours;
        }

    }
}
