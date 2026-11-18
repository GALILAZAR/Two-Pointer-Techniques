class Solution {
    public int mostFrequentEven(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
           
        }
        int Max = 0;
        int key = -1;

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > Max)
            {
                Max = entry.getValue();
                key = entry.getKey();
            }
            else if(entry.getValue() == Max && entry.getKey() < key)
            {
                key = entry.getKey();
            }
        }
        return key;


        
    }
}