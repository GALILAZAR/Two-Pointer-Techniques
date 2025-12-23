class Solution {
    public int[] twoSum(int[] nums, int target) { // [2,7,11,15]
        int n = nums.length; // Array length = 4
        for(int i = 0 ; i<nums.length-1; i++){
            for(int j= i+1; j<n; j++){ 
                if(nums[i]+nums[j] == target){ // 2+7=9 Condition true
                    return new int []{i,j};
                }  
            }
        }
        return new int[]{};
       
    }
}