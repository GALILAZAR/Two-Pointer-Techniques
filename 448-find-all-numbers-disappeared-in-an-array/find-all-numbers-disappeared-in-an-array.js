/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let freq = new Array(nums.length+1).fill(0);

    let arr = new Array();

    for(let i = 0; i<nums.length; i++)
    {
        freq[nums[i]]++;
    }
    for(let i = 1;i<freq.length; i++)
    {
        if(freq[i] == 0)
        {
            arr.push(i);
        }
    }
    return arr;
};