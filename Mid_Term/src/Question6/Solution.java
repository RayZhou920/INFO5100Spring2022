package Question6;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Time Complexity: ON
    // Space Complexity: ON for the hashmap
    public static int findLongestSubstring(String str) {
        if (str == null || str.length() == 0) return 0;

        Map<Character, Integer> hashmap = new HashMap<>();

        int left = 0;
        int right = 0;
        char duplicate = ' ';
        int res = Integer.MIN_VALUE;
        while (right < str.length()) {
            char cur = str.charAt(right);
            if (hashmap.containsKey(cur) && hashmap.get(cur) >= 1) {
                duplicate = cur;
                while (str.charAt(left) != duplicate) {
                    hashmap.put(str.charAt(left), hashmap.get(str.charAt(left)) - 1);
                    left++;
                }
                hashmap.put(str.charAt(left), hashmap.get(str.charAt(left)) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);
            hashmap.put(cur, hashmap.getOrDefault(cur, 0) + 1);
            right++;
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(findLongestSubstring(str));
    }
}
