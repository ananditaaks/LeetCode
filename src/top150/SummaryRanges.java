package top150;

import java.util.*;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) i++;

            if (start != nums[i])
                res.add(start + "->" + nums[i]);
            else
                res.add(String.valueOf(start));
        }
        return res;
    }

    public static void main(String[] args) {
        SummaryRanges obj = new SummaryRanges();
        System.out.println(obj.summaryRanges(new int[]{0,1,2,4,5,7}));
    }
}