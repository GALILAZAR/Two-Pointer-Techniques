class Solution {
    public int missingMultiple(int[] nums, int k) {

        int freq[] = new int[101];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        for (int i = k; ; i += k) {

            if (i > 100 || freq[i] == 0) {
                return i;
            }
        }
    }
}