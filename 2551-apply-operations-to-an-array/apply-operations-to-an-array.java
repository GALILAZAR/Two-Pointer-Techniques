class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Pass 1: apply merge operations sequentially
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Pass 2: shift all zeros to the end
        int[] result = new int[n];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                result[pos++] = nums[i]; // place non-zeros first
            }
        }
        // remaining slots in result are already 0 by default

        return result;
    }
}