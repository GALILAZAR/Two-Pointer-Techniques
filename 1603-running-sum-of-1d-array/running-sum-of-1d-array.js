/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    let arr = new Array(nums.length);
    let index = 0;

    let sum = 0;

    for(let i = 0; i<nums.length; i++)
    {
        sum = sum+nums[i];
        arr[index] = sum;
        index++;
    }
    return arr;
    
};