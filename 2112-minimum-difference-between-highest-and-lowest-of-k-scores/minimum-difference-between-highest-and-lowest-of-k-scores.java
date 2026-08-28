class Solution {
    public int minimumDifference(int[] nums, int k) {

        if(k == 1)
        {
            return 0;
        }
        Arrays.sort(nums); // 1 4 7 9
        
       int Min = Integer.MAX_VALUE;
       for(int i = 0; i<=nums.length-k; i++)
       {
            int diff = nums[i+k-1]-nums[i];  // 4 - 1 = 3 // 3 // 

            Min = Math.min(Min,diff);
       }
       return Min;
        
    }
}