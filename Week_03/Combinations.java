package Week_03;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0 ; i < n ; i++) {
            arr.add( i + 1);
        }
        toCombine(result, arr, k, temp, 0);
        return result;
    }

    private void toCombine(List<List<Integer>> result, List<Integer> arr, int k, List<Integer> temp, int start) {
        for ( int i = start ; i < arr.size() ; i++ ) {
            int pos = temp.size();
            temp.add(arr.get(i));
            if (temp.size() == k) {
                result.add(new ArrayList<>(temp));
            } else {
                this.toCombine(result, arr, k, temp, start + 1);
                temp.remove(pos);
            }
        }
    }

}
