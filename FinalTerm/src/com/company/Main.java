package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

// Rui Zhou for the final term
public class Main {

    public static void main(String[] args) {
	// write your code here
        // test cases:
        String test1 = "(){]{}";
        System.out.println(isValid(test1));
        String str = "aabcccccaaa";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(compressString(str));
        int n = 8;
        int[] result = sumZero(5);
        for (int i : result) System.out.println(i);
        int[] test = {1,2,3,4,5};
        int k = 1;
        System.out.println(findKthLargest(test, k));
    }

    // Question 1: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    // time: ON / space: ON
    public static boolean isValid(String s) {
        //TODO: Write your code here
        if (s == null || s.length() == 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else return false;
        }
        return stack.isEmpty();
    }

    // Question 2: String Compression
    // Input: "aabcccccaaa"
    // Output: "a2b1c5a3"
    // time: ON
    // space: O1
    public static String compressString(String str){
        //TODO: Write your code here
        if (str == null || str.length() == 0) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            int j = i;
            while (j < str.length() && str.charAt(j) == cur) {
                j++;
            }
            int number = j - i;
            sb.append(cur);
            sb.append(String.valueOf(number));
            i = j - 1;
        }
        return sb.toString().length() >= str.length() ? str : sb.toString();
    }

    // Question 3: Given a string s, find the length of the longest substring without repeating characters.
    // Input: s = "pwwkew" "aa"
    // Output: 3 1
    // time: ON
    // space: OlogN
    public static int lengthOfLongestSubstring(String s) {
        //TODO: Write your code here
        if (s == null || s.length() == 0) return 0;

        int res = 0;
        // char - numbers in the sliding window
        Map<Character, Integer> hashmap = new HashMap<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (left < i && hashmap.containsKey(c)) {
                char ch = s.charAt(left);
                hashmap.put(ch, hashmap.get(ch) - 1);
                if (hashmap.get(ch) == 0) {
                    hashmap.remove(ch);
                }
                left++;
            }
            hashmap.put(c, 1);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }

    // Question 4: Given an integer n, return any array containing n unique integers such that they add up to 0.
    // time: ON space: O1
    public static int[] sumZero(int n) {
        //TODO: Write your code here
        int[] res = new int[n];
        if (n == 0) return res;
        int l = 0;
        int r = n - 1;
        int index = 1;
        while (l <= r) {
            if (l == r) {
                res[l] = 0;
                break;
            }
            res[l] = index;
            res[r] = -index;
            index++;
            l++;
            r--;
        }
        return res;
    }

    // Question 5: Given an integer array nums and an integer k, return the kth largest element in the array.
    //  Input: nums = [3,2,1,5,6,4], k = 2
    //  Output: 5
    // time: ON space: ONlogN
    public static int findKthLargest(int[] nums, int k) {
        //TODO: Write your code here
        if (nums == null || nums.length == 0) return 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);
        for (int i : nums) {
            queue.add(i);
            while (queue.size() > k) queue.poll();
        }
        return queue.isEmpty() ? 0 : queue.peek();
    }
}
