class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        int Min = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for(int right = 0; right < nums.length; right++)
        {
            sum = sum + nums[right];

            while(sum >= target)
            {
                int len = right - left + 1;
                Min = Math.min(Min, len);

                sum = sum - nums[left];
                left++;
            }
        }
       return Min == Integer.MAX_VALUE ? 0 :Min;
    }
}