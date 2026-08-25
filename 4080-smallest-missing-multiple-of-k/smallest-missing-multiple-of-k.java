class Solution {
    public int missingMultiple(int[] nums, int k) {

        int freq [] = new int [101];

        for(int i = 0; i<nums.length; i++)
        {
            freq[nums[i]]++;
        }
        int multiple = k;

        while(true)
        {
            if(multiple > 100 || freq[multiple] == 0)
            {
                return multiple;
            }
            multiple += k;
        }
        
    }
}