class Solution {
    public int singleNumber(int[] nums) {
        
        int freq [] = new int [60001];
        int offset = 30000;

        for(int i = 0; i<nums.length; i++)
        {
            freq[nums[i] + offset]++;
        }
        for(int i = 0; i<freq.length; i++)
        {
            if(freq[i] == 1)
            {
                return i - offset;
            }
        }
        return -1;
    }    

}