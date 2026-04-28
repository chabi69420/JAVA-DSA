import java.util.*;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int x = 0; x <= n; x++) {
            int index = lowerBound(nums, x);
            int count = n - index;

            if (count == x) return x;
        }

        return -1;
    }

    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] < target) low = mid + 1;
            else high = mid;
        }

        return low;
    }
}