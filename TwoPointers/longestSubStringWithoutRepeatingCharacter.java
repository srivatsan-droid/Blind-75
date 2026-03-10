import java.util.*;
public class longestSubStringWithoutRepeatingCharacter {
	public static int longestSubString(String s) {
		HashSet<Character> set = new HashSet<>();
		int left = 0,max = 0;
		for(int right = 0;right < s.length();right++) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			max = Math.max(max,right - left + 1);
		}
		return max;
	}
	public static void main(String[] args) {
		String s = "abcabcbb";
		int ans = longestSubString(s);
		System.out.println(ans);
	}
}