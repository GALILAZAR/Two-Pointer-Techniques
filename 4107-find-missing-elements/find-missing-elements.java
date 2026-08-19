class Solution {
    public List<Integer> findMissingElements(int[] nums) {

       List <Integer> list = new ArrayList<>();
        int freq [] = new int [101];

       int Min = Integer.MAX_VALUE;
       int Max = Integer.MIN_VALUE;

       for(int i = 0; i<nums.length; i++)
       {
            freq[nums[i]]++;

            if(nums[i] > Max)
            {
                Max = nums[i];
            }
            if(nums[i] < Min)
            {
                Min = nums[i];
            }
       }
       for(int i = Min; i<=Max; i++)
       {
        if(freq[i] == 0)
        {
            list.add(i);
        }
       }
      return list;
      
      
    }   
       
}                              