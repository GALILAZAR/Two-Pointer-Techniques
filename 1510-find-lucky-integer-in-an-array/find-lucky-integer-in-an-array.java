class Solution {
    public int findLucky(int[] arr) {
        
        int freq [] = new int[501];

        for(int i = 0; i<arr.length; i++)
        {
            freq[arr[i]]++;
        }

        int Max = -1;
        
        for(int i = 1; i<freq.length; i++)
        {
           
            if(freq[i] == i )
            {
                Max = Math.max(Max,i);
                
            }
        }
        return Max;
        
    }
}