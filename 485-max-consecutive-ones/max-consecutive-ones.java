class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int CurrNum = 0;
        int MaxNum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                CurrNum++;
            }
            else
            {
                MaxNum = Math.max(MaxNum, CurrNum);
                CurrNum = 0;
            }
        }

        MaxNum = Math.max(MaxNum, CurrNum);

        return MaxNum;
    }
}