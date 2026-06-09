class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {   
            int temp = nums[i], length = 0;
            while(temp != 0){
                 length++;
                temp = temp / 10;
            }
            if(length % 2 == 0)
            {
                count++;
            }
               
        }
        return count;
        
    }
}