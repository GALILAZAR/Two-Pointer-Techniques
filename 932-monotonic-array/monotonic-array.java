class Solution {
    public boolean isMonotonic(int[] nums) {

        int direction = 0;

        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i] < nums[i+1])
            {
                if(direction == -1)
                {
                    return false;
                }
                else{
                    direction = 1;
                }
            }
            else if(nums[i] > nums[i+1])
            {
                if(direction == 1)
                {
                    return false;
                }
                else{
                    direction = -1;
                }
            }
            
            
        }
        return true;
    }
}