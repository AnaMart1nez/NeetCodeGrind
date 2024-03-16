package Array;
public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int k = 0; // iterate through the valid k elements
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

