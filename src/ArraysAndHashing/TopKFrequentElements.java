package ArraysAndHashing;

import java.util.*;

public class TopKFrequentElements {
    static void main() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println(map);

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int idx = 0;
        while (!minHeap.isEmpty()) {
            res[idx++] = minHeap.poll().getKey();
        }

        Arrays.sort(res);
        return res;
    }

}
