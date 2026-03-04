package Hashing_Arrays;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static int[] frequentElements(int nums[], int k) {
        // Step 1: Build frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            //Frequency Map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create PriorityQueue with custom comparator (max-heap by frequency)
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) ->
                map.get(b) - map.get(a)  // Higher frequency comes first
        );

        // Step 3: Add all keys to the PriorityQueue
        for (int key : map.keySet()) {
            queue.offer(key);
        }

        // Step 4: Extract top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int ans[] = frequentElements(nums, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}