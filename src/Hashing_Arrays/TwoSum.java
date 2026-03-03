package Hashing_Arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] twosumBrute(int nums[],int target) {
        int size = nums.length;
        for(int i = 0;i < size;i++) {
            for(int j = i + 1;j < size;j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSumOpti(int nums[],int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSumOpti(nums,target);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
