package top150;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        obj.rotate(nums, 3);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}