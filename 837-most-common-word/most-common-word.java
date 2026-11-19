class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        

        Set<String> set = new HashSet<>();

        for(String str : banned)
        {
            set.add(str);
        }
        Map<String,Integer> map = new HashMap<>();
        String[] arr = paragraph.toLowerCase().split("[^a-z]+");

        for(int i = 0; i<arr.length; i++)
        {
            if(!set.contains(arr[i]))
            {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        int max = 0;
        String result = "";

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > max)
            {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;

    }
}