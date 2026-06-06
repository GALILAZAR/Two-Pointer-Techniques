class Solution {
    public long minimumSteps(String s) {

       int i = 0;
       int j = 0; 
       long SwapCount = 0;

       for(i = 0; i<s.length(); i++)
       {
        if(s.charAt(i) == '0')
        {
            SwapCount = SwapCount + (i-j);
            j++;
        }
       }
       return SwapCount;
    }
}