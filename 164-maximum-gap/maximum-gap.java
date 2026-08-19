class Solution {
    public int maximumGap(int[] nums) {

        Arrays.sort(nums);
        if(nums.length < 2)
        {
            return 0;
        }
        int Max = 0;
        for(int i = 0; i<nums.length-1; i++)
        {
            int diff = Math.abs(nums[i]-nums[i+1]);
            Max = Math.max(Max,diff);
        }
        return Max;
    }
}