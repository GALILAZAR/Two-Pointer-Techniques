class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int window = 0;
        int Max = Integer.MIN_VALUE;

        for(int i = 0; i<k; i++)
        {
            window = window + nums[i];
        }
        Max = window;
        for(int i = k; i<nums.length; i++)
        {
            window = window + nums[i]-nums[i-k];
            Max = Math.max(window, Max);
        }
        return (double)Max / k;
    }
}