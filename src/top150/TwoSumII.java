package top150;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSumII obj = new TwoSumII();
        int[] nums = {2,7,11,15};

        int[] res = obj.twoSum(nums, 9);
        System.out.println(res[0] + " " + res[1]);
    }
}