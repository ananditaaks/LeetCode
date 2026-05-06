package top150;

public class MinSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, min = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        MinSubarraySum obj = new MinSubarraySum();
        int[] nums = {2,3,1,2,4,3};

        System.out.println(obj.minSubArrayLen(7, nums));
    }
}