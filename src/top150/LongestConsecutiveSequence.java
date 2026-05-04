package top150;

import java.util.*;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int max = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curr = n;
                int len = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        System.out.println(obj.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}