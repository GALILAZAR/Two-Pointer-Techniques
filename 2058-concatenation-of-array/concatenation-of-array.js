/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {

    let arr = new Array(nums.length);
    let index = 0;

    for(let i = 0; i<nums.length; i++)
    {
        arr[index] = nums[i];
        index++;
    }
    return nums.concat(arr);
};