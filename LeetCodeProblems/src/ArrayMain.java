import Array.*;
import java.util.*;
public class ArrayMain {
    public static void main(String[] args) {
        testRemoveDuplicates();
        testRemoveElements();
    }
    public static void testRemoveDuplicates() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

        Remove_Duplicates RemoveDups = new Remove_Duplicates();
        int k = RemoveDups.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    public static void testRemoveElements() {
        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = {0,1,3,0,4}; // The expected answer with correct length.
        // It is sorted with no values equaling val.
        Remove_Element RemoveElem = new Remove_Element();
        int k = RemoveElem.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        Arrays.sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}