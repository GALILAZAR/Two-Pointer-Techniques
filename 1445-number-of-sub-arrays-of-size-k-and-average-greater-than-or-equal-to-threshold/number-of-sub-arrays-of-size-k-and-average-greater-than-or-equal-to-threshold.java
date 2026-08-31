class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {


        double nums [] = new double [arr.length-k+1];
        int index = 1;
        int windowAvg = 0;
        for(int i = 0; i<k; i++)
        {
            windowAvg = windowAvg + arr[i] ;
        }
        nums[0] =(double) windowAvg / k;
        
        for(int i = k; i<arr.length; i++)
        {
            windowAvg = windowAvg + arr[i]-arr[i-k];
            nums[index] = (double)(windowAvg) / k;
            index++;
        }
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] >= threshold)
            {
                count++;
            }
        }
        return count;
    }
}