public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int result = 0;
        int temp = 0;
        for ( int i = 0 ; i < nums.length ; i++ ){
            if( result == 0 ){
                temp = nums[i];
                result++;
            } else if ( temp != nums[i] ) {
                temp = nums[i];
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }


}
