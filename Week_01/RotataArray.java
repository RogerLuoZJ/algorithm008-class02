public class RotataArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int temp = 0;
        int next = 0;
        int last = 0;
        if(k != 0){
            for ( int j = 0 ; j < k ; j++ ) {
                temp = nums[nums.length - 1];
                for ( int i = 1 ; i < nums.length; i++ ) {
                    if ( i == 1 ) {
                        last = nums[i] ;
                        nums[i] = nums[i - 1];
                    } else {
                        next = nums[i];
                        nums[i] = last;
                        last = next;
                    }
                }
                nums[0] = temp;
            }
        }
    }
}
