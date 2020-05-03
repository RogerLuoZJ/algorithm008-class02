package Week_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        toFindList(result, temp, nums);
        return result;
    }

    private void toFindList(List<List<Integer>> result, List<Integer> temp,  int[] arr) {
        if (arr.length == 0) {
            List<Integer> r = new ArrayList<>(temp.size());
            r.addAll(temp);
            result.add(r);
        } else{
            //取其中一个值进行下一步
            for ( Integer i = 0 ; i < arr.length ; i++ ) {
                temp.add(arr[i]);
                int index = temp.size() - 1;
                int[] next = new int[arr.length  - 1];
                int k = 0 ;
                for (Integer j = 0 ; j < arr.length ; j++ ) {
                    if (!j.equals(i)) {
                        next[k] = arr[j];
                        k++;
                    }
                }
                toFindList( result, temp, next );
                temp.remove(index);
            }
        }
    }
}
