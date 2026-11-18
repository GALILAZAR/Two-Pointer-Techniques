class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length-k];
        
    }

}

//1 2 3 4 5 6