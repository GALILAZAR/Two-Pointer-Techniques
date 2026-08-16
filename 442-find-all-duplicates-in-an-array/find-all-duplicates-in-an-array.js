/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {

    let freq = new Array(100001).fill(0);
    let arr = new Array();
    for(let i = 0; i<nums.length; i++)
    {
        freq[nums[i]]++;
    }
    for(let i = 0; i<freq.length; i++)
    {
        if(freq[i] > 1)
        {
            arr.push(i);
        }
    }
    return arr;
};