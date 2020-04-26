import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTwice {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for ( int i = 0 ; i < nums.length ; i++ ) {
            int gap = target - nums[i];
            if (map.containsKey(gap)) {
                return new int[]{ map.get(gap), i };
            } else {
                map.put(nums[i], i);
            }

        }


        return null;
    }
}
