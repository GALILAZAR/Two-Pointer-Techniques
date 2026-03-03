class Solution {
    public int missingNumber(int[] nums) {

        int supposeSum = nums.length* (nums.length+1)/2;
        int currentSum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            currentSum += nums[i];
        }
        return supposeSum - currentSum;
        
    }
}