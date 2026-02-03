class Solution {
    public int findDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i= 0; i<nums.length; i++)
        {
            int num = nums[i];

            if(map.containsKey(num))
            {
                return num;
            }
            else
            {
                map.put(num,1);
            }
        }
        return -1;
        
    }
}