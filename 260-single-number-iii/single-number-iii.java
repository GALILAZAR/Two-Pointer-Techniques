class Solution {
    public int[] singleNumber(int[] nums) {

        int arr[] = new int[2];
        int index = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length ; i++) {

            if ( i+1 <nums.length && nums[i] == nums[i + 1]) {
                i++;
            } 
            else {
                arr[index] = nums[i];
                index++;
            }
        }

        return arr;
    }
}