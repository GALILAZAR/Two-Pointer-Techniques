class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int freq [] = new int[100001];
         List<Integer> result = new ArrayList<>();

        for(int i = 0; i<nums.length; i++)
        {
            freq[nums[i]]++;
        }
        for(int i = 0; i<freq.length; i++)
        {
            if(freq[i] > 1)
            {
                result.add(i);
            }
        }
        return result;
    }
}