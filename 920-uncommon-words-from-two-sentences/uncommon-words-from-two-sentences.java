class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String [] arr = s1.split(" ");
        String arr1 [] = s2.split(" ");
        
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i = 0; i<arr1.length; i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                    list.add(entry.getKey());
            }
        }
         return list.toArray(new String[0]);

        
    }
}