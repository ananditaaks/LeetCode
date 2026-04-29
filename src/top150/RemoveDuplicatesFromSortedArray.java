package top150;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray  obj = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2};

        int k = obj.removeDuplicates(nums);

        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}