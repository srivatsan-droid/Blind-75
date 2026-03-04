package Hashing_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupString(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0;i < strs.length;i++) {
           char[] c = strs[i].toCharArray();
           Arrays.sort(c);
           String key = new String(c);
           map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
       }
       return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupString(strs);
        for(int i = 0;i < ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }
}
