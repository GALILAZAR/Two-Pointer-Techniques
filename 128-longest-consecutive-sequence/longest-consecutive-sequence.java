class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int current = 1;
        int second_streak = 1;

        for(int i = 0; i<list.size()-1; i++)
        {
            if(list.get(i+1)-list.get(i) == 1)

            {
                current++;
            }
            else
            {
                current= 1;
            }
            
          second_streak = Math.max(current,second_streak);
        }
        if(list.size() == 0)
        {
            return 0;
        }
        return second_streak;

    }
}