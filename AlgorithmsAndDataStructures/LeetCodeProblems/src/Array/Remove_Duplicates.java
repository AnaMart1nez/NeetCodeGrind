package Array;
public class Remove_Duplicates {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] != nums[k]) {
                // make room for the next unique value incrementing position k by 1,
                // to place it next to the previous unique value
                nums[++k] = nums[i];
            }
        }
        // because we started count at 0, add 1 to get the actual number of unique values
        return k + 1;
    }
}

