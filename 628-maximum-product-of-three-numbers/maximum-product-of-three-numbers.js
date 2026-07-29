/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumProduct = function(nums) {

    nums.sort((a,b) => a-b);

    let first = nums[nums.length-1];
    let second = nums[nums.length-2];
    let third = nums[nums.length-3];

    let max = first*second*third;
    let max2 = nums[0] * nums[1] * nums[nums.length - 1];
    let result = Math.max(max,max2);
    return result;
};