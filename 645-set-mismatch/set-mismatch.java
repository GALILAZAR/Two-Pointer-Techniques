class Solution {
    public int[] findErrorNums(int[] nums) {

        int freq [] = new int [nums.length+1];
        for(int i = 0; i<nums.length; i++)
        {
            freq[nums[i]]++;
        }
        int duplicate = -1;
        int missing = -1;

        for(int i = 0; i<freq.length; i++)
        {
            if(freq[i] >= 2)
            {
                duplicate = i;
            }
            if(freq[i] == 0)
            {
                missing = i;
            }
        }
        return new int []{duplicate,missing};
        
    }
}