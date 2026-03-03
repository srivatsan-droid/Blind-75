package Hashing_Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicateMapMethod(int nums[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > 1) {
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicateSetMethod(int nums[]) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(!set.add(num)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        boolean ans = containsDuplicateSetMethod(nums);
        System.out.println(ans);
    }
}
