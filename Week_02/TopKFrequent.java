import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {


    public int[] topKFrequent(int[] nums, int k) {
        Map map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, ((int)map.get(i) + 1));
            } else {
                map.put(i, 1);
            }
        }

        PriorityQueue queue = new PriorityQueue<Map.Entry<Integer, Integer>>((a, b)->{
            return b.getValue() - a.getValue();
        });

        queue.addAll(map.entrySet());
        int[] result = new int[k];
        for ( int i = 0 ; i < result.length ; i++ ) {
            result[i] = (int) ((Map.Entry)queue.poll()).getKey();
        }
        return result;
    }

}
