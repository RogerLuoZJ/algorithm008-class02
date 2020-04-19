public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int notZeroNum = 0;
        for ( int i = 0 ; i < nums.length ; i++) {
            if ( nums[i] != 0 ) {
                nums[notZeroNum] = nums[i];
                notZeroNum++;
            }
        }

        if ( notZeroNum == nums.length ) {
            return;
        }

        for ( int i = notZeroNum ; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
