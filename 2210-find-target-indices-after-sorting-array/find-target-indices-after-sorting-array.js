/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var targetIndices = function(nums, target) {

    nums.sort((a,b) => a - b);
    
    let arr = [];
    let index = 0;
    for(let i = 0; i<nums.length; i++)
    {
        if(nums[i] == target)
        {
            arr[index] = i;
            index++;
        }
    }
    return arr;
    
};